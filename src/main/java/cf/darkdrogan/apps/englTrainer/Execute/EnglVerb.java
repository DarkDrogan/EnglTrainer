package cf.darkdrogan.apps.englTrainer.Execute;

import cf.darkdrogan.apps.englTrainer.Variables;

/**
 * Created by drogan on 05.12.15.
 */
public class EnglVerb implements Variables {
    static String word;
    //getter english verb
    public static String getVerb(String[] words, int time, int prenoun, int form, int voice){
        if(voice == ACTIVE){
            //check out to irregular verb
            if(time == PAST && (words[4]+"ed").equals(words[5]) && form == ANSWER)
            {
                word = words[4] + "ed";
            }
            //irregular verb, for exapmle cost - cost - cost
            if(time == PAST && words[4].equals(words[5]) && form == ANSWER)
            {
                word = words[4];
            }
            if(time == PAST && (!words[4].equals(words[5])) && form == ANSWER)
            {
                word = words[5];
            }
            if(time != PAST && form != ANSWER){
                word = words[4];
            }
            if(time == PRESENT && form == ANSWER){
                word = words[4];
                if(prenoun == HE || prenoun == SHE || prenoun == IT){
                    word += "s";
                }
            }
        }//third form irregular verb, need to write regular verb - lately
        if(voice == PASSIVE){
            word = words[6];
        }
        return word;
    }
}
