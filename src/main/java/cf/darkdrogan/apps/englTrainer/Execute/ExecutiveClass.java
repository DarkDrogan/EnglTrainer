package cf.darkdrogan.apps.englTrainer.Execute;

import cf.darkdrogan.apps.englTrainer.TrainingModuls.TrainingModul;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Execute class.
 * It take array words, shuffling, casting to full form answer and check out user's answer.
 */
public final class ExecutiveClass {

    /**
     * checkOutStr ??
     */
    private String checkOutStr;
    //temporary for test changed on public. For final - change on private. Or do getter
    //You should decide and name the namr of the variable more clear. And javadoc it.

    /**
     * What is it? baby, don't hurt me, don't hurt me, comment.
     */
    private String[] aWords;

    /**
     * If this class is only a utility class,
     * you should make the class final and define a private constructor.
     */
    private ExecutiveClass() {
    }


    /**
     * Getter for class.
     * @return ExecutiveClass instance.
     */
    public static ExecutiveClass getExecutiveClass() {
        return new ExecutiveClass();
    }

    /**This method get array words from trainingModul and shuffle asks.
     * TrainingModul already have words. If we take words from class Words - we'll have different set of words.
     * @param trainingModul TrainingModul
     */
    public void getCompleteWords(final TrainingModul trainingModul) {
        aWords = trainingModul.getCompleteWords();
        shuffleMethod(aWords);
    }

    /** Method for test trainer in console
     * This method take phrase and compare it with user's answers.
     * @param reader Reader
     * @throws IOException IOException from reader.
     */
    public void prohod(final BufferedReader reader) throws IOException {
        for (int i = 0; i < aWords.length; i++) {
            if (i % 2 == 0) {
                System.out.println(aWords[i]);
            }
            checkOutStr = reader.readLine();
            checkOut(checkOutStr, aWords[++i]);
        }
    }
    //May be we need change logic for check with array right answers, cuz
    // he's - he is and he has - it need pointed (see method fullPhrase too) - yeah! I know, my english is very bad

    // I dont't now for the present

    /**
     * Checks entered string with right string.
     * @param checkWord Cheking word.
     * @param word ??
     */
    // NOTICE: parameters should be final!
    // this need replace to boolean
    protected void checkOut(String checkWord, String word) {
        String s = word;
        checkWord = simplifyWord(checkWord);
        word = simplifyWord(word);
        if (word.equalsIgnoreCase(checkWord)) {
            System.out.println("That's right! Hell yeah!");
        } else {
            System.out.println("You need learn it better! \n " + s);
        }
    }

    private String simplifyWord(String testWord){
        testWord = testWord.replace("?", "").toLowerCase().replace(".", "").replace("!", "");
        if(testWord.contains("\'")){
            testWord = fullPhrase(testWord).trim();
        }
        return testWord;
    }

    /**
     * Do short phrase as full (убейте меня за мой английский) for example I'll do - I will do.
     * @param pPhrase Phrase
     * @return full phrase
     */
    protected String fullPhrase(final String pPhrase) {
        String phrase = pPhrase;
        do {
            if (phrase.contains("\'s")) {
                //temporary he's = he has, but need make he's - he is, for context
                phrase = phrase.replace("\'s", " has");
            } else if (phrase.contains("\'ll")) {
                phrase = phrase.replace("\'ll", " will");
            } else if (phrase.contains("\'re")) {
                phrase = phrase.replace("\'re", " are");
            } else if (phrase.contains("\'m")) {
                phrase = phrase.replace("\'m", " am");
            } else if (phrase.contains("won\'t")) {
                phrase = phrase.replace("won\'t", "will not");
            } else if (phrase.contains("can\'t")) {
                phrase = phrase.replace("can\'t", "can not");
            } else if (phrase.contains("n\'t")) {
                phrase = phrase.replace("n\'t", " not");
            } else if (phrase.contains("\'ve")) {
                phrase = phrase.replace("\'ve", " have");
            } else if (phrase.contains("\'d")) {
                phrase = phrase.replace("\'d", " had");
            }
        } while (phrase.contains("\'"));
        return phrase;
    }

    /**
     * Shuffles array for random order of couple strings.
     * @param words Words
     * @return shuffle words
     */
    // NOTICE: parameters should be final!
    protected String[] shuffleMethod(final String[] words) {
        //direct init of x is redundant:
        //This inspection points out the cases where a variable value is never used after its assignment, i.e.:  
        //- the variable never gets read after assignment OR
        //  - the value is always overwritten with another assignment before the next variable read OR
        //  - the variable initializer is redundant (for one of the above two reasons) OR
        //  - the variable is never used.
        //Кстати да. зачем клонировать-то?
        // И это. Поясни, что проходит через этот метод - у меня есть мысль как его сделать правильно.
        int x;
        int y = 0;
        String[] wordsN = words.clone();
        List<Integer> list1 = new ArrayList<Integer>();
        for (int j = 0; j < words.length / 2; j++) {
            list1.add(j);
        }
        Collections.shuffle(list1);
        for (int i = 0; i < words.length / 2; i++) {
            x = list1.get(i) * 2;
            words[y++] = wordsN[x];
            words[y++] = wordsN[x + 1];
        }
        return words;
    }

    /**
     * Words getter.
     * @return aWords.
     */
    public String[] getaWords() {
        return aWords;
    }
}
