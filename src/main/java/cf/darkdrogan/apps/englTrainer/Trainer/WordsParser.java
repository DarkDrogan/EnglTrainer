package cf.darkdrogan.apps.englTrainer.Trainer;

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
    File file;

    public final String jsonParse() throws FileNotFoundException{
        String output = "";
        FileReader reader  = new FileReader(file);
        JSONParser parser = new JSONParser();

        try {
            JSONObject topObject = (JSONObject) parser.parse(reader);
            JSONArray array = (JSONArray)topObject.get("bear");
            output = array.get(2).toString();
            //print full json
            System.out.println(topObject.toJSONString());
        } catch (ParseException e){
            e.getPosition();
        } catch (IOException e){
            e.printStackTrace();
        }
        return output;
    }

    public WordsParser(final String pFilename) {
        ClassLoader loader = this.getClass().getClassLoader();
        try {
            this.file = new File(loader.getResource(pFilename).getFile());
        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws FileNotFoundException{

        WordsParser parser = new WordsParser("ru_words.json");
        System.out.println(parser.jsonParse());
    }

}
