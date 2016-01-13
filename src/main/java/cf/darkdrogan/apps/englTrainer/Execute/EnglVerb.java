package cf.darkdrogan.apps.englTrainer.Execute;

import cf.darkdrogan.apps.englTrainer.Variables;

/**
 * Class for getting english word.
 */

public final class EnglVerb implements Variables {
    /**
     * If this class is only a utility class,
     * you should make the class final and define a private constructor.
     */
    private EnglVerb() {
    }

    /**
     * returning word.
     */
    private static String word;
    /**
     * Getter for english word.
     * @param words words array
     * @param time  time
     * @param prenoun   prenoun
     * @param form  form
     * @param voice voice
     * @return  right form of have
     */
    public static String getVerb(final String[] words, final int time, final int prenoun, final int form, final int voice) {
        if (voice == ACTIVE) {
            //check out to irregular verb
            if (time == PAST && (words[4] + "ed").equals(words[5]) && form == ANSWER) {
                word = words[4] + "ed";
            }
            //irregular verb, for example cost - cost - cost
            if (time == PAST && words[4].equals(words[5]) && form == ANSWER) {
                word = words[4];
            }
            if (time == PAST && (!words[4].equals(words[5])) && form == ANSWER) {
                word = words[5];
            }
            if (time != PAST && form != ANSWER) {
                word = words[4];
            }
            if (time == PRESENT && form == ANSWER) {
                word = words[4];
                if (prenoun == HE || prenoun == SHE || prenoun == IT) {
                    char[] x = word.toCharArray();
                    switch (x[x.length - 1]) {
                        case 'z':
                        case 'x':
                        case 'o':
                        case 's':
                            word += "es";
                            break;
                        case 'h':
                            if (x[x.length - 2] == 's' || x[x.length - 2] == 'c') {
                                word += "es";
                            }
                            break;
                        case 'y':
                            switch (x[x.length - 2]) {
                                case 'b':
                                case 'c':
                                case 'd':
                                case 'f':
                                case 'g':
                                case 'h':
                                case 'j':
                                case 'k':
                                case 'l':
                                case 'm':
                                case 'n':
                                case 'p':
                                case 'r':
                                case 's':
                                case 't':
                                case 'x':
                                case 'z':
                                    word = word.replace("y", "ies");
                                default:
                                    break;
                            }
                        default: word += "s";
                            break;
                    }
                }
            }
        }
        //third form irregular verb, need to write regular verb - lately
        if (voice == PASSIVE) {
            word = words[6];
        }
        return word;
    }

    public static EnglVerb getEnglVerb(){
        return new EnglVerb();
    }
}
