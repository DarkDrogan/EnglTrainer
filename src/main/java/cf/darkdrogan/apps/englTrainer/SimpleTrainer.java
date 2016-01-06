package cf.darkdrogan.apps.englTrainer;

import java.util.*;

/**
 * Created by drogan on 05.12.15.
 */
public class SimpleTrainer implements Trainer, Variables{
    private Random rand;
    private String word;
    private String phrase;
    private static String[] completeWords;

    SimpleTrainer(){}

    SimpleTrainer(String[] words){
        rand = new Random();
        int i = 0;
        completeWords = new String[18];
        for(int time = 0; time < 3; time++){
            for(int form = 0; form < 3; form++){
                int xPrenoun = rand.nextInt(7);
                phrase = "to " + words[4] + " - " + words[0];
                completeWords[i] = getRus(words, time, xPrenoun, form);
                i++;
                completeWords[i] = getEngl(words, time, xPrenoun, form);
                i++;
            }
        }
    }

    public Trainer getTrainer(String[] words){
        return new SimpleTrainer(words);
    }

    public String getStartPhrase() {
        return phrase;
    }

    public String[] getCompleteWords(){
        return completeWords;
    }

    public String[] getCompleteWords(String[] words){
        new SimpleTrainer(words);
        return completeWords;
    }

    //method for take rus phrases
    private String getRus(String[] words, int time, int prenoun, int form){
         word = " " + RusVerb.getVerb(words, time, prenoun, form, ACTIVE);
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
                        " " + EnglVerb.getVerb(words, PRESENT, prenoun, form, Variables.ACTIVE) + "?";
            if(time == FUTURE)
                word = "Will " + Prenoun.getEnglPrenoun(prenoun) + " " + EnglVerb.getVerb(words,  PAST, prenoun, form,  ACTIVE) + "?";
        }
        if(form == ANSWER){
            if(time == PRESENT || time == PAST)
                word = Prenoun.getEnglPrenoun(prenoun) + " " + EnglVerb.getVerb(words, time, prenoun, form, ACTIVE);
            if(time == FUTURE)
                word = Prenoun.getEnglPrenoun(prenoun) + " will " + EnglVerb.getVerb(words, time, prenoun, form, ACTIVE);
        }
        if(form == NEGATIVE){
            if(time == PRESENT || time == PAST)
                word = Prenoun.getEnglPrenoun(prenoun) + " " + AdditionalVerbs.getDo(time, prenoun, form, ACTIVE) + " " + EnglVerb.getVerb(words, (byte)1, prenoun, form, (byte)0);
            if(time == FUTURE)
                word = Prenoun.getEnglPrenoun(prenoun) + " will not " + EnglVerb.getVerb(words,  PAST, prenoun, form,  ACTIVE);
        }
        return word;
    }
}