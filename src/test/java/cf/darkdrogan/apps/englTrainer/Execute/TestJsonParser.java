package cf.darkdrogan.apps.englTrainer.Execute;

import cf.darkdrogan.apps.englTrainer.TrainingModuls.WordsParser;
import org.junit.*;
import java.io.FileNotFoundException;
import static org.junit.Assert.*;

/**
 * Created by serafim on 17.01.16.
 */
public class TestJsonParser {

    @Test
    public void testParseMethod() throws FileNotFoundException{
        WordsParser parser = new WordsParser();
        String output = parser.jsonParse("ru_words.json");
        assertEquals(output,"рожа");
    }

    @Test(expected = NullPointerException.class)
    public void testBrokenJson() throws FileNotFoundException{
        WordsParser parser = new WordsParser();
        parser.jsonParse("broken.json");
    }

    @Test(expected = NullPointerException.class)
    public void testNPE() throws FileNotFoundException{
        WordsParser parser = new WordsParser();
        parser.jsonParse(null);
    }

}
