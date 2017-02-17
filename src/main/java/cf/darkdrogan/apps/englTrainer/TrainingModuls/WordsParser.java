package cf.darkdrogan.apps.englTrainer.TrainingModuls;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by mavdeev on 1/13/16.
 * Parser for InVerbs
 */
public class WordsParser {
    String output;

    public String jsonParse(String pFilename) throws FileNotFoundException{
        ClassLoader loader = this.getClass().getClassLoader();
        System.out.println(loader.getResource(pFilename).toString());
        File parsing_file = new File(loader.getResource(pFilename).getFile());
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(parsing_file)) {
            JSONObject topObject = (JSONObject) parser.parse(reader);
            JSONArray array = (JSONArray)topObject.get("bear");
            output = array.get(2).toString();
//            print full json - string for test
//            System.out.println(topObject.toJSONString());
        } catch (ParseException e){
            e.getPosition();
        } catch (IOException e){
            e.printStackTrace();
        }
        return output;
    }

    /**
     * Empty constructor.
     */
    public WordsParser() {
    }
}
