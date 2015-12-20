package darkdrogan.apps;

/**
 * Created by drogan on 05.12.15.
 */
public interface Trainer {
    //return complete string for lesson
    String[] getCompleteWords();
    //=)
    String[] getCompleteWords(String[] words);
    //return phrase for start(if you don't know words)
    String getStartPhrase();
    //create new string for words
    Trainer getTrainer(String[] words);
}
