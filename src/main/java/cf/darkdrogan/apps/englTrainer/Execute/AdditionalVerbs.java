package cf.darkdrogan.apps.englTrainer.Execute;

import cf.darkdrogan.apps.englTrainer.ConditionConstant;

/**
 * This class give another additional verb, for example do, be, have.
 */
public final class AdditionalVerbs implements ConditionConstant {
    /**
    * If this class is only a utility class,
     * you should make the class final and define a private constructor.
     */
    private AdditionalVerbs() {
    }

    /**
     * returning word.
     */
    private static String word;

    /**
     * Getter for have.
     * @param time  time
     * @param prenoun   prenoun
     * @param form  form
     * @param voice voice
     * @return  right form of have
     */
    public static String getHave(final int time, final int prenoun, final int form, final int voice) {
        //we use "==" because interface ConditionConstant have int constants of times, prenoun, and others. See ConditionConstant
        if (time == PAST) {
            word = "had";
        }

        if (time == PRESENT) {
            word = "have";
            if (prenoun == HE || prenoun == SHE || prenoun == IT) {
                word = "has";
            }
        }

        return word;
    }

    /**
     * Getter for be.
     * @param time  time
     * @param prenoun   prenoun
     * @param form  form
     * @param voice voice
     * @return  right form of be
     */
    public static String getBe(final int time, final int prenoun, final int form, final int voice) {
        if (time == PAST) {
            if (prenoun == I || prenoun == HE || prenoun == SHE || prenoun == IT) {
                if (form == ANSWER || form == ASK) {
                    word = "was";
                }
                if (form == NEGATIVE) {
                    word = "wasn't";
                }
            }

            if (prenoun == WE || prenoun == YOU || prenoun == THEY) {
                if (form == ANSWER || form == ASK) {
                    word = "were";
                }
                if (form == NEGATIVE) {
                    word = "weren't";
                }
            }
        }

        if (time == PRESENT) {
            if (prenoun == I) {
                word = "am";
                if (form == NEGATIVE) {
                    word += " not";
                }
            }
            if (prenoun == WE || prenoun == YOU || prenoun == THEY) {
                word = "are";
                if (form == NEGATIVE) {
                    word += "n't";
                }
            }
            if (prenoun == HE || prenoun == SHE || prenoun == IT) {
                word = "is";
                if (form == NEGATIVE) {
                    word += "n't";
                }
            }
        }
        return word;
    }

    /**
     * Getter for do.
     * @param time  time
     * @param prenoun   prenoun
     * @param form  form
     * @param voice voice
     * @return  right form of do
     */
    public static String getDo(final int time, final int prenoun, final int form, final int voice) {
        if (time == PRESENT) {
            if (form == ASK) {
                word = "Do";
                if (prenoun == HE || prenoun == SHE || prenoun == IT) {
                    word = "Does";
                }
            }
            if (form == NEGATIVE) {
                word = "Don't";
                if (prenoun == HE || prenoun == SHE || prenoun == IT) {
                    word = "Doesn't";
                }
            }
        }

        if (time == PAST) {
            word = "Did";
            if (form == NEGATIVE) {
                word = "Didn't";
            }
        }

        return word;
    }

    public static AdditionalVerbs getAddVerb(){
        return new AdditionalVerbs();
    }
}
