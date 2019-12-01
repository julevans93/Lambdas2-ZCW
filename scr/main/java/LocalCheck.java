public class LocalCheck implements PersonCheck{
    @Override
    public boolean test(Person person) {
        return person.getGender().equals(Person.Sex.FEMALE)
                && person.getAge() >= 21;
    }
}
