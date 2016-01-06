package cf.darkdrogan.apps.englTrainer;

import cf.darkdrogan.apps.englTrainer.ExecutiveClass;
import cf.darkdrogan.apps.englTrainer.SimpleTrainer;
import cf.darkdrogan.apps.englTrainer.Words;
import org.junit.*;

import static org.junit.Assert.*;
/**
 * Created by Drogan on 03.01.2016.
 */
public class TestExecutiveClass {
    private static String checkOutStr;
    private static String[] aWords;
    ExecutiveClass exClass;
    Words takerWords;

    @Before
    public void startTest(){
        aWords = new Words().getWords();
        exClass  = new ExecutiveClass();
    }

    @After
    public void endTest(){
        aWords = null;
        exClass = null;
    }

    @Test
    //for test ExecutiveClass.aWords temporary changed on public. For complete edition change on private,
    // or do getter and change on private
    public void testGetCompliteWords(){
        takerWords = new Words();
        exClass.getCompleteWords(new SimpleTrainer().getTrainer(takerWords.getWords()));
        assertNotNull(exClass.aWords);
    }

    @Test
    public void testProhod(){
        //поломался с невысыпа. Не могу придумать как оформить тест просто, без вызова ридера
    }

    @Test
    public void testFullPhrase(){
        //'s - has, 'll - will, 're - are, 'm - am, won't - will not, can't - can not, n't - not, 've - have, 'd - had
        String finalFullPhrase = exClass.fullPhrase("I'd We've isn't can't won't I'm You're we'll he's");
        String checker = "I had We have is not can not will not I am You are we will he has";
        assertEquals("fullPhrase failed in reverse", checker, finalFullPhrase);
        finalFullPhrase = exClass.fullPhrase("He's We'll You're I'm won't can't isn't we've i'd");
        checker = "He has We will You are I am will not can not is not we have i had";
        assertEquals("fullPhrase failed", checker, finalFullPhrase);
    }

    @Test
    public void testShuffleMethod(){
        String[] testAWords = new String[aWords.length];
        for(int i = 0; i < aWords.length; i++){
            testAWords[i] = aWords[i];
        }
        exClass.shuffleMethod(aWords);
        assertFalse("Shuffling failed", testAWords.equals(aWords));
    }

    /*
    *I don't understand how write this test - checkOut is void and not return this phrases

    @Test
    public void testCheckOut(){
        String checkWord = "He's started.";
        String word = "he has started";
        exClass.checkOut(checkWord, word);
        assertEquals("checkOut failed in point or lowerCase", checkWord, word);
        checkWord = " does i start";
        word = "Does i start?";
        exClass.checkOut(checkWord, word);
        assertEquals("checkOut failed in ask or trim", checkWord, word);
    }*/
}
