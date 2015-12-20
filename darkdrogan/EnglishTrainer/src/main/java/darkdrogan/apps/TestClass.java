package darkdrogan.apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by drogan on 28.11.15.
 */
public class TestClass{
    //this array take strings
    private static Trainer trainer1;
    private static ExecutiveClass execute;

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Words takerWords = new Words();
        execute = new ExecutiveClass();

        for(int x = 0; x < 1; x++) {
            trainer1 = new SimpleTrainer().getTrainer(takerWords.getWords());
            execute.getCompleteWords(trainer1);
            System.out.println(trainer1.getStartPhrase());
            execute.prohod(reader);
        }

        trainer1 = new IrVerbsTrainer().getTrainer(takerWords.getWords());
        execute.getCompleteWords(trainer1);
        System.out.println(trainer1.getStartPhrase());
        execute.prohod(reader);
    }
}
