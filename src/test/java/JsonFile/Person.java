package JsonFile;

import java.util.List;

public class Person {

    String firstName;
    String lastName;
    List<Address> address;

    public List<Address> getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public String toString(){
        return getFirstName()+ "," + getLastName()+ "," + getAddress();
    }
}
