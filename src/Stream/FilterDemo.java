package Stream;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 22,"male", "New York"));
        personList.add(new Person("Jack", 7000,18,"male", "Washington"));
        personList.add(new Person("Lily", 7800,24,"female", "Washington"));
        personList.add(new Person("Anni", 8200, 15,"female", "New York"));
        personList.add(new Person("Owen", 9500, 31,"male", "New York"));
        personList.add(new Person("Alisa", 7900,28, "female", "New York"));
       // personList.stream().filter();
    }


}
