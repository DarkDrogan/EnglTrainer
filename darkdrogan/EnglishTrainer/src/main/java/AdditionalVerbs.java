/**
 * Created by drogan on 05.12.15.
 */
public class AdditionalVerbs {
    private static String word;

    public static String getHave(byte time, byte prenoun, byte form, byte voice){
        if(time == 0){
            word = "had";
        }
        if(time == 1){
            word = "have";
            if(prenoun == 3 || prenoun == 4 || prenoun == 5){
                word = "has";
            }
        }
        return word;
    }

    public static String getBe(byte time, byte prenoun, byte form, byte voice){
        if(time == 0){
            if(prenoun == 0 || prenoun == 3 || prenoun == 4 || prenoun == 5){
                if(form == 1 || form == 0){
                    word = "was";
                }
                if(form == 2){
                    word = "wasn't";
                }
            }
            if(prenoun == 1 || prenoun == 2 || prenoun == 6){
                if(form == 1 || form == 0){
                    word = "were";
                }
                if(form == 2){
                    word = "weren't";
                }
            }
        }
        if(time == 1){
            if(prenoun == 0){
                word = "am";
                if(form == 2){
                    word += " not";
                }
            }
            if(prenoun == 1 || prenoun == 2 || prenoun == 6){
                word = "are";
                if(form == 2){
                    word += "n't";
                }
            }
            if(prenoun == 3 || prenoun == 4 || prenoun == 5){
                word = "is";
                if(form == 2){
                    word += "n't";
                }
            }
        }
        return word;
    }

    public static String getDo(byte time, byte prenoun, byte form, byte voice){
        if(time == 1){
            if(form == 0){
                word = "Do";
                if(prenoun == 3 || prenoun == 4 || prenoun == 5){
                    word = "Does";
                }
            }
            if(form == 2){
                word = "Don't";
                if(prenoun == 3 || prenoun == 4 || prenoun == 5){
                    word = "Doesn't";
                }
            }
        }
        if(time == 0){
            word = "Did";
            if(form == 2)
                word = "didn't";
        }
        return word;
    }
}
