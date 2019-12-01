import java.util.LinkedList;
import java.util.List;

public class CheckPerson {

    public static List<Person> check (List<Person> persons, PersonCheck testing){
        List<Person> list = new LinkedList<>();
        for (Person person : persons){
            if (testing.test(person))list.add(person);
        }
        return list;
    }

    private boolean test(Person person){
        return false;
    }
}
