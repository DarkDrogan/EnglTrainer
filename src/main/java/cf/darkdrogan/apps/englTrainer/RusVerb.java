package cf.darkdrogan.apps.englTrainer;

/**
 * Created by drogan on 30.11.15.
 */
public class RusVerb implements Variables{
    private static String word;

    //method returned rus verb in the needed form
    //need create StringBuilder and use it here
    public static String getVerb(String[] words, int time, int prenoun, int form, int voice){
        //if times != future
        //take word for passive voice, now useless cuz my lovely language is Russian. Russian only for Russian
        if(voice == PASSIVE){
            //take it for past time=)
            if(time == PAST) {
                if (prenoun == I || prenoun == YOU || prenoun == HE){
                    return "был " + words[9];
                } else if (prenoun == WE || prenoun == THEY){
                    return "были " + words[9] + "ы";
                } else if (prenoun == SHE){
                    return "была " + words[9] + "а";
                } else if(prenoun == IT){
                    return "было " + words[9] + "о";
                }
            }
            //for present
            if(time == PRESENT){
                if (prenoun == I || prenoun == YOU || prenoun == HE){
                    return words[9];
                } else if (prenoun == WE || prenoun == THEY){
                    return words[9] + "ы";
                } else if (prenoun == SHE){
                    return words[9] + "а";
                } else if(prenoun == IT){
                    return words[9] + "о";
                }
            }

        }
        //if active voice and not future time
        if(time != FUTURE) {
            //проверяю спряжение, если первое
            if (Byte.parseByte(words[7]) == 1) {
                if (time == PRESENT) {
                    //беру слово и наращиваю окончание в зависимости от местоимения
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
                }
                if (time == PAST) {
                    word = words[3];
                    //getRusVerbPastI (String pastForm,int prenoun){
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
                }
            }
            //второе спряжение не будущее время
            else if (Byte.parseByte(words[7]) == 2) {
                if (time == PRESENT) {
                    //getRusVerbPresentII(String[] word, int prenoun)
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
                } else if (time == PAST) {
                    word = words[3];
                    //getRusVerbPastII(String pastForm, int prenoun){
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
                }
            }//future time is come
        }else if (time == FUTURE) {
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
        return word;
    }
}
