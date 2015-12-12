import java.util.*;

/**
 * Created by drogan on 05.12.15.
 */
public class SimpleTrainer implements Trainer{
    private Random rand;
    private String word;
    private String phrase;
    private static String[] completeWords;

    SimpleTrainer(){}

    SimpleTrainer(String[] words){
        rand = new Random();
        int i = 0;
        completeWords = new String[18];
        for(byte time = 0; time < 3; time++){
            for(byte form = 0; form < 3; form++){
                byte xPrenoun = (byte)rand.nextInt(7);
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

    private String getRus(String[] words, byte time, byte prenoun, byte form){
         word = " " + RusVerb.getVerb(words, time, prenoun, form, (byte)0);
        if(form == 0 || form == 1){
            word = Prenoun.getRusPrenoun(prenoun) + word;
            if(form == 0)
                word += "?";
        }
        if(form == 2){
            word = Prenoun.getRusPrenoun(prenoun) + " не" + word;
        }
        return word;
    }

    private String getEngl(String[] words, byte time, byte prenoun, byte form){
        if(form == 0){
            if(time == 1 || time == 0)
                word = AdditionalVerbs.getDo(time, prenoun, form, (byte)0) + " " + Prenoun.getEnglPrenoun(prenoun) + " " + EnglVerb.getVerb(words, (byte)1, prenoun, form, (byte)0) + "?";
            if(time == 2)
                word = "Will " + Prenoun.getEnglPrenoun(prenoun) + " " + EnglVerb.getVerb(words, (byte) 0, prenoun, form, (byte) 0) + "?";
        }
        if(form == 1){
            if(time == 1 || time == 0)
                word = Prenoun.getEnglPrenoun(prenoun) + " " + EnglVerb.getVerb(words, time, prenoun, form, (byte)0);
            if(time == 2)
                word = Prenoun.getEnglPrenoun(prenoun) + " will " + EnglVerb.getVerb(words, time, prenoun, form, (byte)0);
        }
        if(form == 2){
            if(time == 1 || time == 0)
                word = Prenoun.getEnglPrenoun(prenoun) + " " + AdditionalVerbs.getDo(time, prenoun, form, (byte)0) + " " + EnglVerb.getVerb(words, (byte)1, prenoun, form, (byte)0);
            if(time == 2)
                word = Prenoun.getEnglPrenoun(prenoun) + " will not " + EnglVerb.getVerb(words, (byte) 0, prenoun, form, (byte) 0);
        }
        return word;
    }
}