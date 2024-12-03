package JsonFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class readingDatafromJson {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        File file = new File(".\\Data\\employee.json");

       Person person = objectMapper.readValue(file,Person.class);

       System.out.println("Firstname is : "+ person.getFirstName());
       System.out.println("Lastname is : "+ person.getLastName());

       for (Address address:person.getAddress()){
           System.out.println("Street : "+ address.getStreet());
           System.out.println("City "+ address.getCity());
           System.out.println("State "+ address.getState());
       }
    }
}
