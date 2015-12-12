import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by drogan on 28.11.15.
 */
public class TestClass implements Times{
    private static String[] aWords;
    private static String checkOutStr;
    private static Trainer trainer1;

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Words takerWords = new Words();
        Random rand = new Random();
        aWords = takerWords.getWords();

        trainer1 = new SimpleTrainer().getTrainer(takerWords.getWords());
        aWords = trainer1.getCompleteWords();
        System.out.println(trainer1.getStartPhrase());
        shuffleMethod(aWords);
        for(int i = 0; i < aWords.length; i++) {
            if (i % 2 == 0)
                System.out.println(aWords[i]);
            checkOutStr = reader.readLine();
            checkOut(checkOutStr, aWords[++i]);
        }


        trainer1 = new IrVerbsTrainer().getTrainer(takerWords.getWords());
        aWords = trainer1.getCompleteWords();
        System.out.println(trainer1.getStartPhrase());
        shuffleMethod(aWords);
        for(int i = 0; i < aWords.length; i++) {
            if (i % 2 == 0)
                System.out.println(aWords[i]);
            checkOutStr = reader.readLine();
            checkOut(checkOutStr, aWords[++i]);
        }
    }

    private static void checkOut(String checkWord, String word){
        String s = word;
        checkWord = checkWord.replace("?", "").toLowerCase();
        word = word.replace("?", "").toLowerCase();
        checkWord.trim();
        word.trim();
        if(word.equalsIgnoreCase(checkWord))
            System.out.println("That's right! Hell yeah!");
        else {
            System.out.println("You need learn it better! \n " + s);
        }
    }

    private static String[] shuffleMethod(String[] words){
        int x = 0;
        int y = 0;
        String[] wordsN = words.clone();
        List<Integer> list1 = new ArrayList<Integer>();
        for(int j = 0; j < words.length/2; j++)
            list1.add(j);
        Collections.shuffle(list1);
        for(int i = 0; i < words.length/2; i++) {
            x = list1.get(i) * 2;
            words[y++] = wordsN[x];
            words[y++] = wordsN[x + 1];
        }
        return words;
    }
}
