package darkdrogan.apps;

/**
 * Created by drogan on 30.11.15.
 */
public class RusVerb {
    private static String word;
    public static String getVerb(String[] words, byte time, byte prenoun, byte form, byte voice){
        //if times != future
        if(voice == 1){
            if(time == 0) {
                if (prenoun == 0 || prenoun == 2 || prenoun == 3){
                    return "был " + words[9];
                } else if (prenoun == 1 || prenoun == 6){
                    return "были " + words[9] + "ы";
                } else if (prenoun == 4){
                    return "была " + words[9] + "а";
                } else if(prenoun == 5){
                    return "было " + words[9] + "о";
                }
            }
            if(time == 1){
                if (prenoun == 0 || prenoun == 2 || prenoun == 3){
                    return words[9];
                } else if (prenoun == 1 || prenoun == 6){
                    return words[9] + "ы";
                } else if (prenoun == 4){
                    return words[9] + "а";
                } else if(prenoun == 5){
                    return words[9] + "о";
                }
            }

        }
        if(time != 2) {
            //проверяю спряжение, если первое
            if (Byte.parseByte(words[7]) == 1) {
                if (time == 1) {
                    word = words[2];
                    //getRusVerbPresentI (String[] words,int prenoun){
                    switch (prenoun) {
                        case 0:
                            word += "ю";
                            break;
                        case 1:
                            word += "ем";
                            break;
                        case 2:
                            word += "ешь";
                            break;
                        case 3:
                        case 4:
                        case 5:
                            word += "ет";
                            break;
                        case 6:
                            word += "ют";
                            break;
                        default:
                            break;
                    }
                }
                if (time == 0) {
                    word = words[3];
                    //getRusVerbPastI (String pastForm,int prenoun){
                    switch (prenoun) {
                        case 0:
                            break;
                        case 1:
                            word += "и";
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            word += "а";
                            break;
                        case 5:
                            word += "о";
                            break;
                        case 6:
                            word += "и";
                            break;
                        default:
                            break;
                    }
                }
            }
            //второе спряжение не будущее время
            else if (Byte.parseByte(words[7]) == 2) {
                if (time == 1) {
                    //getRusVerbPresentII(String[] word, int prenoun)
                    word = words[2];
                    switch (prenoun) {
                        case 0:
                            word = words[1];
                            break;
                        case 1:
                            word += "им";
                            break;
                        case 2:
                            word += "ишь";
                            break;
                        case 3:
                        case 4:
                        case 5:
                            word += "ит";
                            break;
                        case 6:
                            word += "ят";
                            break;
                        default:
                            break;
                    }
                } else if (time == 0) {
                    word = words[3];
                    //getRusVerbPastII(String pastForm, int prenoun){
                    switch (prenoun) {
                        case 0:
                            break;
                        case 1:
                            word += "и";
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            word += "а";
                            break;
                        case 5:
                            word += "о";
                            break;
                        case 6:
                            word += "и";
                            break;
                        default:
                            break;
                    }
                }
            }
        } else if (time == 2) {
            word = words[0];
            //getRusVerbFuture(String infinitiveForm, int prenoun){
            switch (prenoun) {
                case 0:
                    word = "буду " + word;
                    break;
                case 1:
                    word = "будем " + word;
                    break;
                case 2:
                    word = "будешь " + word;
                    break;
                case 3:
                case 4:
                case 5:
                    word = "будет " + word;
                    break;
                case 6:
                    word = "будут " + word;
                    break;
                default:
                    break;
            }
        }
        return word;
    }
}
