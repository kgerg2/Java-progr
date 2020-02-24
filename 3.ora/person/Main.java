package person;

public class Main {

    public static void main(String[] args) {
        Person personOne = new Person(Gender.MALE, "John", "Doe", "Programmer", 1989);
        Person personTwo = personOne;
        Person personThree = new Person(Gender.MALE, "Johny", "Doe", "Programmer", 1989);
        System.out.println(personOne.equals(personTwo));
        System.out.println(personOne.equals(personThree));
    }
}