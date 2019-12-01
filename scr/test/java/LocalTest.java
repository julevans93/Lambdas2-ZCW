import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class LocalTest {

    List<Person> list = new LinkedList<>();
    Person person1 = new Person("Kit", LocalDate.of(1993, 8, 28), Person.Sex.FEMALE, "email@email.com");
    Person person2 = new Person("Bob", LocalDate.of(1992, 3, 16), Person.Sex.MALE, "myemail.email.com");

    @Before
    public void setUp(){
        list.add(person1);
        list.add(person2);
    }

    @Test
    public void testLocal(){
        CheckPerson checkPerson = new CheckPerson();
        PersonCheck tester = new LocalCheck();

        List<Person> actual = CheckPerson.check(list, tester);

        Assert.assertEquals(true,actual);
    }

}
