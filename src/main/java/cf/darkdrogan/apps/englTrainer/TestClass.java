package cf.darkdrogan.apps.englTrainer;

import cf.darkdrogan.apps.englTrainer.Execute.ExecutiveClass;
import cf.darkdrogan.apps.englTrainer.StorageForWords.IrVerbWords;
import cf.darkdrogan.apps.englTrainer.StorageForWords.Words;
import cf.darkdrogan.apps.englTrainer.TrainingModuls.SimpleTrainingModul;
import cf.darkdrogan.apps.englTrainer.TrainingModuls.TrainingModul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by drogan on 28.11.15.
 */
public class TestClass{
    private static TrainingModul trainingModul1;
    private static ExecutiveClass executer;

    public static void main(String[] args) throws IOException{
        //for training into the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //WordsParser parser = new WordsParser();
        //String e = parser.jsonParse("ru_words.json");
        //System.out.println(e);
        Words takerWords = new IrVerbWords();
        executer = ExecutiveClass.getExecutiveClass();

        for(int x = 0; x < 3; x++) {
            trainingModul1 = SimpleTrainingModul.getTrainer(takerWords.getWords());
            executer.getCompleteWords(trainingModul1);
            System.out.println(trainingModul1.getMainWord());
            executer.prohod(reader);
        }
    }
}