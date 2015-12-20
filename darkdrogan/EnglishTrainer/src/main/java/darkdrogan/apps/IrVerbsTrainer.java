package darkdrogan.apps;

import java.util.Random;

/**
 * Created by drogan on 05.12.15.
 */

public class IrVerbsTrainer implements Trainer, Times{
    private byte prenoun1, prenoun2, prenoun3;
    private String phrase;
    private String rus1, rus2, rus3, engl1, engl2, engl3;
    private String[] completeWords;

    //for free start with .getTrainer()
    IrVerbsTrainer(){}

    IrVerbsTrainer(String[] words){
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
            engl1 = Prenoun.getEnglPrenoun(prenoun1) + " " + EnglVerb.getVerb(words, PRESENT, prenoun1, ANSWER, ACTIVE);
            engl2 = Prenoun.getEnglPrenoun(prenoun2) + " " + EnglVerb.getVerb(words, PAST, prenoun2, ANSWER, ACTIVE);
            engl3 = Prenoun.getEnglPrenoun(prenoun3) + " " + AdditionalVerbs.getBe(timePas, prenoun3, ANSWER, PASSIVE) + " " + EnglVerb.getVerb(words, timePas, prenoun3, ANSWER, PASSIVE);
            rus1 = Prenoun.getRusPrenoun(prenoun1) + " " + RusVerb.getVerb(words, PRESENT, prenoun1, ANSWER, ACTIVE);
            rus2 = Prenoun.getRusPrenoun(prenoun2) + " " + RusVerb.getVerb(words, PAST, prenoun2, ANSWER, ACTIVE);
            rus3 = Prenoun.getRusPrenoun(prenoun3) + " " + RusVerb.getVerb(words, timePas, prenoun3, ANSWER, PASSIVE);
            completeWords[i++] = rus1;
            completeWords[i++] = engl1;
            completeWords[i++] = rus2;
            completeWords[i++] = engl2;
            completeWords[i++] = rus3;
            completeWords[i++] = engl3;
            words = new Words().getWords();
        }
    }

    public Trainer getTrainer(String[] words){
        return new IrVerbsTrainer(words);
    }

    public String getStartPhrase(){
        return phrase;
    }

    public String[] getCompleteWords(){
        return completeWords;
    }

    public String[] getCompleteWords(String[] words){
        new IrVerbsTrainer(words);
        return completeWords;
    }
}
