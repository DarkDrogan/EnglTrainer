package cf.darkdrogan.apps.englTrainer;

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
        words = new Words().getWords(13);
    }

    @After
    public void endTest(){
        verb = null;
        words = null;
    }

    @Test
    public void testGetVerb(){
        String feel = verb.getVerb(words, PRESENT, I, ANSWER, ACTIVE);
        String feels = verb.getVerb(words, PRESENT, HE, ANSWER, ACTIVE);
        String felt =  verb.getVerb(words, PAST, THEY, ANSWER, ACTIVE);
        assertEquals("feel failed", "feel", feel);
        assertEquals("feels failed", "feels", feels);
        assertEquals("felt failed", "felt", felt);
    }
}
