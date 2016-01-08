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

    @Before
    public void startTest(){
        verb = new EnglVerb();
        //change again on words = feel. now it's 13 in array
        words = new IrVerbWords().getWords(13);
    }

    @After
    public void endTest(){
        verb = null;
        words = null;
    }

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
}
