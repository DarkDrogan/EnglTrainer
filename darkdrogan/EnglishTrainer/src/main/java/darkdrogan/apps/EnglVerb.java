package darkdrogan.apps;

/**
 * Created by drogan on 05.12.15.
 */
public class EnglVerb {
    static String word;
    public static String getVerb(String[] words, byte time, byte prenoun, byte form, byte voice){
        if(voice == 0){
            if(time == 0 && (words[4]+"ed").equals(words[5]) && form == 1)
            {
                word = words[4] + "ed";
            }
            if(time == 0 && words[4].equals(words[5]) && form == 1)
            {
                word = words[4];
            }
            if(time == 0 && (!words[4].equals(words[5])) && form == 1)
            {
                word = words[5];
            }
            if(time != 0 && form != 1){
                word = words[4];
            }
            if(time == 1 && form == 1){
                word = words[4];
                if(prenoun == 3 || prenoun == 4 || prenoun == 5){
                    word += "s";
                }
            }
        }
        if(voice == 1){
            word = words[6];
        }
        return word;
    }
}
