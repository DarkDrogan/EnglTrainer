package cf.darkdrogan.apps.englTrainer.Execute;

import cf.darkdrogan.apps.englTrainer.Execute.EnglVerb;
import cf.darkdrogan.apps.englTrainer.StorageForWords.IrVerbWords;
import cf.darkdrogan.apps.englTrainer.Variables;
import org.junit.*;

import static org.junit.Assert.*;
/**
 * Created by Drogan on 07.01.2016.
 */
public class TestEnglVerb implements Variables {
    EnglVerb verb;
    String[] words;
    String[] wordsDo;
    String[] wordsGo;
    String[] wordsTeach;
    String[] wordsStudy = {"учить", "учу", "уч", "учил", "study", "studied", "studied", "2", "0", "обучен"};

    @Before
    public void startTest(){
        verb = EnglVerb.getEnglVerb();
        IrVerbWords ir = new IrVerbWords();
        //change again on words = feel. now it's 13 in array
        wordsDo = ir.getWords(29);
        wordsGo = ir.getWords(45);
        wordsTeach = ir.getWords(7);
    }

    @After
    public void endTest(){
        verb = null;
        words = null;
        wordsDo = null;
        wordsGo = null;
        wordsTeach = null;
    }

    /*
    @Test
    public void testGetVerb(){
        String iFeel = verb.getVerb(words, PRESENT, I, ANSWER, ACTIVE);
        String weFeel = verb.getVerb(words, PRESENT, WE, ANSWER, ACTIVE);
        String youFeel = verb.getVerb(words, PRESENT, YOU, ANSWER, ACTIVE);
        String heFeels = verb.getVerb(words, PRESENT, HE, ANSWER, ACTIVE);
        String sheFeels = verb.getVerb(words, PRESENT, SHE, ANSWER, ACTIVE);
        String itFeels = verb.getVerb(words, PRESENT, IT, ANSWER, ACTIVE);
        String theyFeel = verb.getVerb(words, PRESENT, THEY, ANSWER, ACTIVE);
        String felt =  verb.getVerb(words, PAST, THEY, ANSWER, ACTIVE);
        assertEquals("i failed", "feel", iFeel);
        assertEquals("we failed", "feel", weFeel);
        assertEquals("you failed", "feel", youFeel);
        assertEquals("he failed", "feels", heFeels);
        assertEquals("she failed", "feels", sheFeels);
        assertEquals("it failed", "feels", itFeels);
        assertEquals("they failed", "feel", theyFeel);
        assertEquals("felt failed", "felt", felt);
    }
    */

    @Test
    public void testGetVerbWithS(){
        String aDo = verb.getVerb(wordsDo, PRESENT, I, ANSWER, ACTIVE);
        String does = verb.getVerb(wordsDo, PRESENT, HE, ANSWER, ACTIVE);
        assertEquals("failed do", "do", aDo);
        assertEquals("failed does", "does", does);
        String go = verb.getVerb(wordsGo, PRESENT, I, ANSWER, ACTIVE);
        String goes = verb.getVerb(wordsGo, PRESENT, HE, ANSWER, ACTIVE);
        assertEquals("failed go", "go", go);
        assertEquals("failed goes", "goes", goes);
        String teach = verb.getVerb(wordsTeach, PRESENT, I, ANSWER, ACTIVE);
        String teaches = verb.getVerb(wordsTeach, PRESENT, HE, ANSWER, ACTIVE);
        assertEquals("failed teach", "teach", teach);
        assertEquals("failed teaches", "teaches", teaches);
        String study = verb.getVerb(wordsStudy, PRESENT, I, ANSWER, ACTIVE);
        String studies = verb.getVerb(wordsStudy, PRESENT, SHE, ANSWER, ACTIVE);
        assertEquals("failed study", "study", study);
        assertEquals("failed studies", "studies", studies);
    }
}
