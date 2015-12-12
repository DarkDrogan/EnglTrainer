/**
 * Created by drogan on 05.12.15.
 */
public interface Trainer {
    String[] getCompleteWords();
    String[] getCompleteWords(String[] words);
    String getStartPhrase();
    Trainer getTrainer(String[] words);
}
