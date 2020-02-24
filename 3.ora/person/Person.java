package person;

public class Person {
    private Gender gender;
    private String firstName;
    private String lastName;
    private String job;
    private int birthYear;

    public Person(Gender gender, String firstName, String lastName, String job, int birthYear) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return birthYear + ": " + lastName + " " + firstName + " (" + job + ")\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) { // obj.getClass().equals(Person)
            return false;
        }
        Person p = (Person) obj;
        return p.birthYear == this.birthYear && p.firstName.equals(this.firstName) && p.lastName.equals(this.lastName) && p.gender == this.gender && p.job.equals(this.job);
    }
}