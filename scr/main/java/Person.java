import java.time.LocalDate;

public class Person {

    public enum Sex{
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress){
        this.name = "";
        this.birthday = LocalDate.now();
        this.gender = Sex.FEMALE;
        this.gender = Sex.MALE;
        this.emailAddress = "";
    }

    public int getAge(){
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public void printPerson(){
        System.out.println(
                "Name: " + name + "\n"
                + "Birthday: " + birthday.getMonth() + birthday.getDayOfYear()+ birthday.getYear() + "\n"
                + "Gender: " + gender.toString() + "\n"
                + "Email: " + emailAddress
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
