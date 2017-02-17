package cf.darkdrogan.apps.englTrainer.TrainingModuls;

import cf.darkdrogan.apps.englTrainer.Execute.AdditionalVerbs;
import cf.darkdrogan.apps.englTrainer.Execute.EnglishVerbs;
import cf.darkdrogan.apps.englTrainer.Execute.Prenoun;
import cf.darkdrogan.apps.englTrainer.Execute.RussianVerbs;
import cf.darkdrogan.apps.englTrainer.StorageForWords.IrVerbWords;
import cf.darkdrogan.apps.englTrainer.ConditionConstant;

import java.util.Random;

/**
 * Created by drogan on 05.12.15.
 */

public class IrVerbsTrainingModul implements TrainingModul, ConditionConstant {
    private byte prenoun1, prenoun2, prenoun3;
    private String phrase;
    private String rus1, rus2, rus3, engl1, engl2, engl3;
    private String[] completeWords;

    //for free start with .getTrainer()
    public IrVerbsTrainingModul(){}

    IrVerbsTrainingModul(String[] words){
        Random rand = new Random();
        //array for 5 sets of words
        completeWords = new String[30];
        phrase = "";
        for(int i = 0; i < 30;) {
            phrase += words[4] + " " + words[5] + " " + words[6] + " " + words[0] + "\n";
            prenoun1 = (byte) rand.nextInt(7);
            prenoun2 = (byte) rand.nextInt(7);
            prenoun3 = (byte) rand.nextInt(7);
            byte timePas = (byte) rand.nextInt(2);
            engl1 = Prenoun.getEnglPrenoun(prenoun1) + " " + EnglishVerbs.getVerb(words, PRESENT, prenoun1,
                    ANSWER, ACTIVE) + ".";
            engl2 = Prenoun.getEnglPrenoun(prenoun2) + " " + EnglishVerbs.getVerb(words, PAST, prenoun2,
                    ANSWER, ACTIVE) + ".";
            engl3 = Prenoun.getEnglPrenoun(prenoun3) + " " + AdditionalVerbs.getHave(PRESENT, prenoun3,
                    ANSWER, PASSIVE) + " " + EnglishVerbs.getVerb(words, timePas, prenoun3, ANSWER, PASSIVE);
            rus1 = Prenoun.getRusPrenoun(prenoun1) + " " + RussianVerbs.getVerb(words, PRESENT, prenoun1,
                    ANSWER, ACTIVE) + ".";
            rus2 = Prenoun.getRusPrenoun(prenoun2) + " " + RussianVerbs.getVerb(words, PAST, prenoun2,
                    ANSWER, ACTIVE) + ".";
            rus3 = Prenoun.getRusPrenoun(prenoun3) + " " + RussianVerbs.getVerb(words, PAST, prenoun3,
                    ANSWER, ACTIVE) + ". (Present Perfect)";
            completeWords[i++] = rus1;
            completeWords[i++] = engl1;
            completeWords[i++] = rus2;
            completeWords[i++] = engl2;
            completeWords[i++] = rus3;
            completeWords[i++] = engl3;
            words = new IrVerbWords().getWords();
        }
    }

    public TrainingModul getTrainer(String[] words){
        return new IrVerbsTrainingModul(words);
    }

    public String getMainWord(){
        return phrase;
    }

    public String[] getCompleteWords(){
        return completeWords;
    }

    public String[] getCompleteWords(String[] words){
        new IrVerbsTrainingModul(words);
        return completeWords;
    }
}
