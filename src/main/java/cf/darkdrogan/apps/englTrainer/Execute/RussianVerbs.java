package cf.darkdrogan.apps.englTrainer.Execute;

import cf.darkdrogan.apps.englTrainer.ConditionConstant;

/**
 * Javadoc the description of class??
 */
public final class RussianVerbs implements ConditionConstant {
    /**
     * If this class is only a utility class you should make the class final and define a private constructor.
     */
    private RussianVerbs() {
    }

    /**
     * ??
     */
    private static String word;

    /**
     * Javadoc that.
     * Notice
     * @see EnglishVerbs , for example
     * @param words ??
     * @param time ??
     * @param prenoun ??
     * @param form ??
     * @param voice ??
     * @return ??
     */
    public static String getVerb(final String[] words, final int time, final int prenoun, final int form, final int voice) {
        if (voice == PASSIVE) {
            getPassiveVoiceVerb(words, time, prenoun);
        } else if (time == PAST) {
            getPastRusVerb(words, prenoun);
        } else if (time == FUTURE) {
            getFutureRusVerb(words, prenoun);
        } else {
            getPresentRusVerb(words, prenoun);
        }
        return word;
    }

    /**
     * Javadoc that.
     * Notice
     * @see EnglishVerbs , for example
     * @param words ??
     * @param time ??
     * @param prenoun ??
     */
    private static void getPassiveVoiceVerb(final String[] words, final int time, final int prenoun) {
        if (time == PAST) {
            if (prenoun == I || prenoun == YOU || prenoun == HE) {
                word = "был " + words[9];
            } else if (prenoun == WE || prenoun == THEY) {
                word = "были " + words[9] + "ы";
            } else if (prenoun == SHE) {
                word = "была " + words[9] + "а";
            } else if (prenoun == IT) {
                word = "было " + words[9] + "о";
            }
        }
        if (time == PRESENT) {
            if (prenoun == I || prenoun == YOU || prenoun == HE) {
                word = words[9];
            } else if (prenoun == WE || prenoun == THEY) {
                word = words[9] + "ы";
            } else if (prenoun == SHE) {
                word = words[9] + "а";
            } else if (prenoun == IT) {
                word = words[9] + "о";
            }
        }
    }

    /**
     * Javadoc that.
     * @param words ??
     * @param prenoun ??
     */
    private static void getFutureRusVerb(final String[] words, final int prenoun) {
        word = words[0];
        switch (prenoun) {
            case I:
                word = "буду " + word;
                break;
            case WE:
                word = "будем " + word;
                break;
            case YOU:
                word = "будешь " + word;
                break;
            case HE:
            case SHE:
            case IT:
                word = "будет " + word;
                break;
            case THEY:
                word = "будут " + word;
                break;
            default:
                break;
        }
    }

    /**
     * Javadoc that.
     * @param words ??
     * @param prenoun ??
     */
    private static void getPresentRusVerb(final String[] words, final int prenoun) {
        if (Integer.parseInt(words[7]) == 1) {
            word = words[2];
            switch (prenoun) {
                case I:
                    word += "ю";
                    break;
                case WE:
                    word += "ем";
                    break;
                case YOU:
                    word += "ешь";
                    break;
                case HE:
                case SHE:
                case IT:
                    word += "ет";
                    break;
                case THEY:
                    word += "ют";
                    break;
                default:
                    break;
            }
        } else if (Integer.parseInt(words[7]) == 2) {
            word = words[2];
            switch (prenoun) {
                case I:
                    word = words[1];
                    break;
                case WE:
                    word += "им";
                    break;
                case YOU:
                    word += "ишь";
                    break;
                case HE:
                case SHE:
                case IT:
                    word += "ит";
                    break;
                case THEY:
                    word += "ят";
                    break;
                default:
                    break;
            }
        } else if (Integer.parseInt(words[7]) == 3) {
            word = words[2];
            switch (prenoun) {
                case I:
                    word += "у";
                    break;
                case WE:
                    word += "ем";
                    break;
                case YOU:
                    word += "ешь";
                    break;
                case HE:
                case SHE:
                case IT:
                    word += "ет";
                    break;
                case THEY:
                    word += "ут";
                    break;
                default:
                    break;
            }
        } else {
            word = words[2];
            switch (prenoun) {
                case I:
                    word = words[1];
                    break;
                case WE:
                    word += "мся";
                    break;
                case YOU:
                    word += "шься";
                    break;
                case HE:
                case SHE:
                case IT:
                    word += "тся";
                    break;
                case THEY:
                    word += "утся";
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Javadoc that.
     * @param words ??
     * @param prenoun ??
     */
    private static void getPastRusVerb(final String[] words, final int prenoun) {
        if (Integer.parseInt(words[7]) == 1) {
            word = words[3];
            switch (prenoun) {
                case I:
                    break;
                case WE:
                    word += "и";
                    break;
                case YOU:
                    break;
                case HE:
                    break;
                case SHE:
                    word += "а";
                    break;
                case IT:
                    word += "о";
                    break;
                case THEY:
                    word += "и";
                    break;
                default:
                    break;
            }
        } else if (Integer.parseInt(words[7]) == 2) {
            word = words[3];
            switch (prenoun) {
                case I:
                    break;
                case WE:
                    word += "и";
                    break;
                case YOU:
                    break;
                case HE:
                    break;
                case SHE:
                    word += "а";
                    break;
                case IT:
                    word += "о";
                    break;
                case THEY:
                    word += "и";
                    break;
                default:
                    break;
            }
        } else if (Integer.parseInt(words[7]) == 3) {
            word = words[3];
            switch (prenoun) {
                case I:
                    break;
                case WE:
                    word += "и";
                    break;
                case YOU:
                    break;
                case HE:
                    break;
                case SHE:
                    word += "а";
                    break;
                case IT:
                    word += "о";
                    break;
                case THEY:
                    word += "и";
                    break;
                default:
                    break;
            }
        } else {
            word = words[3];
            switch (prenoun) {
                case I:
                case YOU:
                case HE: word += "ся";
                    break;
                case WE:
                case THEY:
                    word += "ись";
                    break;
                case SHE:
                    word += "ась";
                    break;
                case IT:
                    word += "ось";
                    break;
                default:
                    break;
            }
        }
    }

    public static RussianVerbs getRusVerb() {
        return new RussianVerbs();
    }
}
