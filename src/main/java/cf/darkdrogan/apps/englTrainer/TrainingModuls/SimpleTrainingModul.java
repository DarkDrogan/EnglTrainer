package cf.darkdrogan.apps.englTrainer.TrainingModuls;

import cf.darkdrogan.apps.englTrainer.Execute.AdditionalVerbs;
import cf.darkdrogan.apps.englTrainer.Execute.EnglishVerbs;
import cf.darkdrogan.apps.englTrainer.Execute.Prenoun;
import cf.darkdrogan.apps.englTrainer.Execute.RussianVerbs;
import cf.darkdrogan.apps.englTrainer.ConditionConstant;

import java.util.*;

/**
 * Created by drogan on 05.12.15.
 */
public class SimpleTrainingModul implements TrainingModul, ConditionConstant {
    private Random rand;
    private String word;
    private String mainWord;
    private String[] arrayWords;
    private static String[] completeWords;
    private EnglishVerbs englishVerbs;

    //реально нужный конструктор?
    //private SimpleTrainingModul(){}

    private SimpleTrainingModul(String[] words){
        arrayWords = words.clone();
        englishVerbs = EnglishVerbs.getEnglVerb();
        completeWords = new String[18];
        getCompleteWords(arrayWords);
    }

    public static TrainingModul getTrainer(String[] words){
        return new SimpleTrainingModul(words);
    }

    public String getMainWord() {
        return mainWord;
    }

    public String[] getCompleteWords(){
        return completeWords;
    }

    public String[] getCompleteWords(String[] words){
        fillCompleteWordsArray();
        return completeWords;
    }

    private void fillCompleteWordsArray(){
        rand = new Random();
        int i = 0;
        for(int time = 0; time < 3; time++){
            for(int form = 0; form < 3; form++){
                int xPrenoun = rand.nextInt(7);
                mainWord = "to " + arrayWords[4] + " - " + arrayWords[0];
                completeWords[i] = getRus(arrayWords, time, xPrenoun, form);
                i++;
                completeWords[i] = getEngl(arrayWords, time, xPrenoun, form);
                i++;
            }
        }
    }

    //method for take rus phrases
    private String getRus(String[] words, int time, int prenoun, int form){
        word = " " + RussianVerbs.getVerb(words, time, prenoun, form, ACTIVE);
        if(form == ASK || form == ANSWER){
            word = Prenoun.getRusPrenoun(prenoun) + word;
            if(form == ASK)
                word += "?";
        }
        if(form == NEGATIVE){
            word = Prenoun.getRusPrenoun(prenoun) + " не" + word;
        }
        return word;
    }

    //method for take engl phrases
    private String getEngl(String[] words, int time, int prenoun, int form){
        if(form == ASK){
            if(time == PRESENT || time == PAST)
                word = AdditionalVerbs.getDo(time, prenoun, form, ACTIVE) + " " + Prenoun.getEnglPrenoun(prenoun) +
                        " " + englishVerbs.getVerb(words, PRESENT, prenoun, form, ConditionConstant.ACTIVE) + "?";
            if(time == FUTURE)
                word = "Will " + Prenoun.getEnglPrenoun(prenoun) + " " + englishVerbs.getVerb(words,  PAST, prenoun, form,  ACTIVE) + "?";
        }
        if(form == ANSWER){
            if(time == PRESENT || time == PAST)
                word = Prenoun.getEnglPrenoun(prenoun) + " " + englishVerbs.getVerb(words, time, prenoun, form, ACTIVE);
            if(time == FUTURE)
                word = Prenoun.getEnglPrenoun(prenoun) + " will " + englishVerbs.getVerb(words, time, prenoun, form, ACTIVE);
        }
        if(form == NEGATIVE){
            if(time == PRESENT || time == PAST)
                word = Prenoun.getEnglPrenoun(prenoun) + " " + AdditionalVerbs.getDo(time, prenoun, form, ACTIVE) + " " + englishVerbs.getVerb(words, (byte)1, prenoun, form, (byte)0);
            if(time == FUTURE)
                word = Prenoun.getEnglPrenoun(prenoun) + " will not " + englishVerbs.getVerb(words,  PAST, prenoun, form,  ACTIVE);
        }
        return word;
    }
}