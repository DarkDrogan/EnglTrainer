package cf.darkdrogan.apps.englTrainer.Execute;

import cf.darkdrogan.apps.englTrainer.ConditionConstant;
import cf.darkdrogan.apps.englTrainer.StorageForWords.IrVerbWords;
import org.junit.*;

import static org.junit.Assert.*;

public class TestRusVerb implements ConditionConstant {
    RussianVerbs verb;
    String[] words;

    @Before
    public void startTest(){
        verb = RussianVerbs.getRusVerb();
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
