import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readJSONFile {

    public static void main(String[] args) throws IOException, ParseException {
        //initialize JSONParser and create an array of the json objects
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("file1.json"));

        //initialize gson
        Gson gson = new Gson();

        //initialize a hash table that stores the data that is to be parsed
        HT hashtable = new HT();

        //loop through the array of json objects
        for (Object obj : jsonArray) {
            JSONObject jsonObject = (JSONObject) obj;
            

            hashtable.add(jsonObject.get("name"));


//            String name = (String) jsonObject.get("name");
//            String postal_code = (String) jsonObject.get("postal_code");
//            String address = (String) jsonObject.get("categories");
//
//            System.out.println("Name: " + name);
//            System.out.println("Postal code: " + postal_code);
//            System.out.println("Address: " + address);
//            System.out.println(" ");
        }

    }

}
