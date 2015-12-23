package darkdrogan.apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by drogan on 20.12.15.
 */
public class ExecutiveClass {
    private static String checkOutStr;
    private static String[] aWords;

    protected static void getCompleteWords(Trainer trainer){
        aWords = trainer.getCompleteWords();
        shuffleMethod(aWords);
    }

    protected static void prohod(BufferedReader reader) throws IOException {
        for (int i = 0; i < aWords.length; i++) {
            if (i % 2 == 0)
                System.out.println(aWords[i]);
            checkOutStr = reader.readLine();
            checkOut(checkOutStr, aWords[++i]);
        }
    }

    //check entered string to array of right string - yeah! I know, my english is very bad
    protected static void checkOut(String checkWord, String word){
        String s = word;
        checkWord = checkWord.replace("?", "").toLowerCase();
        word = word.replace("?", "").toLowerCase();
        if(checkWord.contains("\'"))
            checkWord = fullPhrase(checkWord);
        if(word.contains("\'"))
            word = fullPhrase(word);
        checkWord.trim();
        word.trim();
        if(word.equalsIgnoreCase(checkWord))
            System.out.println("That's right! Hell yeah!");
        else {
            System.out.println("You need learn it better! \n " + s);
        }
    }

    protected static String fullPhrase(String phrase){
        do{
            if(phrase.contains("\'s")){
                phrase = phrase.replace("\'s", " is");
            }else if(phrase.contains("\'ll")){
                phrase = phrase.replace("\'ll", " will");
            }else if(phrase.contains("\'re")){
                phrase = phrase.replace("\'re", " are");
            }else if(phrase.contains("\'m")) {
                phrase = phrase.replace("\'m", " am");
            }else if(phrase.contains("won\'t")){
                phrase = phrase.replace("won\'t", "will not");
            }else if(phrase.contains("can\'t")) {
                phrase = phrase.replace("\'t", " not");
            }else if(phrase.contains("n\'t")) {
                phrase = phrase.replace("n\'t", " not");
            }else if(phrase.contains("\'ve")){
                phrase = phrase.replace("\'ve", " have");
            }else if(phrase.contains("\'d")) {
                phrase = phrase.replace("\'d", " had");
            }
        }while(phrase.contains("\'"));
        return phrase;
    }

    //shuffle array for random order of couple strings
    protected static String[] shuffleMethod(String[] words){
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
