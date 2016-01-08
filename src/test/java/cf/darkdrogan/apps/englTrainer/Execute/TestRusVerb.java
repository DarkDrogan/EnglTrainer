package cf.darkdrogan.apps.englTrainer.Execute;

import cf.darkdrogan.apps.englTrainer.StorageForWords.IrVerbWords;
import cf.darkdrogan.apps.englTrainer.Variables;
import org.junit.*;

import static org.junit.Assert.*;
/**
 * Created by Drogan on 07.01.2016.
 */
public class TestRusVerb implements Variables {
    RusVerb verb;
    String[] words;

    @Before
    public void startTest(){
        verb = new RusVerb();
        words = new IrVerbWords().getWords(17);
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
        String felt1 =  verb.getVerb(words, PRESENT, THEY, ANSWER, ACTIVE);
        assertEquals("feel failed", "чувствую", feel);
        assertEquals("feels failed", "чувствует", feels);
        assertEquals("felt failed", "чувствовали", felt);
        assertEquals("felt1 failed", "чувствуют", felt1);
    }
}
