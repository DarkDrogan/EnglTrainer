package cf.darkdrogan.apps.englTrainer.Execute;

import cf.darkdrogan.apps.englTrainer.Variables;

/**
 * Created by drogan on 05.12.15.
 */

//This class give another additional verb, for exapmle do, be, have
public class AdditionalVerbs implements Variables {
    private static String word;

    //getter for have
    public static String getHave(int time, int prenoun, int form, int voice){
        //we use "==" because interface Variables have int constants of times, prenoun, and others. See Variables
        if(time == PAST){
            word = "had";
        }
        if(time == PRESENT){
            word = "have";
            if(prenoun == HE || prenoun == SHE || prenoun == IT){
                word = "has";
            }
        }
        return word;
    }

    //getter for be
    public static String getBe(int time, int prenoun, int form, int voice){
        if(time == PAST){
            if(prenoun == I || prenoun == HE || prenoun == SHE || prenoun == IT){
                if(form == ANSWER || form == ASK){
                    word = "was";
                }
                if(form == NEGATIVE){
                    word = "wasn't";
                }
            }
            if(prenoun == WE || prenoun == YOU || prenoun == THEY){
                if(form == ANSWER || form == ASK){
                    word = "were";
                }
                if(form == NEGATIVE){
                    word = "weren't";
                }
            }
        }
        if(time == PRESENT){
            if(prenoun == I){
                word = "am";
                if(form == NEGATIVE){
                    word += " not";
                }
            }
            if(prenoun == WE || prenoun == YOU || prenoun == THEY){
                word = "are";
                if(form == NEGATIVE){
                    word += "n't";
                }
            }
            if(prenoun == HE || prenoun == SHE || prenoun == IT){
                word = "is";
                if(form == NEGATIVE){
                    word += "n't";
                }
            }
        }
        return word;
    }

    //getter for Do
    public static String getDo(int time, int prenoun, int form, int voice){
        if(time == PRESENT){
            if(form == ASK){
                word = "Do";
                if(prenoun == HE || prenoun == SHE || prenoun == IT){
                    word = "Does";
                }
            }
            if(form == NEGATIVE){
                word = "Don't";
                if(prenoun == HE || prenoun == SHE || prenoun == IT){
                    word = "Doesn't";
                }
            }
        }
        if(time == PAST){
            word = "Did";
            if(form == NEGATIVE)
                word = "Didn't";
        }
        return word;
    }
}
