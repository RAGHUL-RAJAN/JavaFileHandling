package JsonFile;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readingJsonFile {
    private static org.json.simple.JSONArray JSONArray;

    public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader(".\\Data\\employee.json");

       /* Object obj = jsonParser.parse(reader); // Json file --> java object

        JSONObject empjsonObj = (JSONObject) obj; // java --> JSON object
       */

//        Converting json file into Json Object

        JSONObject empjsonobj = (JSONObject) jsonParser.parse(reader);

        String fname = (String)empjsonobj.get("firstName");
        String lname = (String)empjsonobj.get("lastName");
        System.out.println("First name is : "+ fname );
        System.out.println("Last name is : "+ lname);

        JSONArray addressArray = (JSONArray)empjsonobj.get("address");

        for (int i = 0; i < addressArray.size(); i++){

            JSONObject address =(JSONObject)addressArray.get(i);
            String street = (String)address.get("street");
            String city = (String) address.get("city");
            String state = (String)address.get("state");

            System.out.println(street+"\t"+ city+"\t"+state);
        }

    }
}
