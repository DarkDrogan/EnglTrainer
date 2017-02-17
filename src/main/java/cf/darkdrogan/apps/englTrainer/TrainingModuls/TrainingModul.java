package cf.darkdrogan.apps.englTrainer.TrainingModuls;

/**
 * Created by drogan on 05.12.15.
 */
public interface TrainingModul {
    //return complete string for lesson
    String[] getCompleteWords();
    //=) May be we can delete it... Useless now
    String[] getCompleteWords(String[] words);
    //return phrase for start(if you don't know words)
    String getMainWord();
    //create new string for words
    TrainingModul getTrainer(String[] words);
}
