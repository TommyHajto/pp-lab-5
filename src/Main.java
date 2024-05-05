import company.beans.Person;
import company.utils.MathUtils;
import company.exceptions.*;



public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        final int b = 10;

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Alice Smith", 25);
            people[2] = new Person("Bob Johnson", 40);
            people[3] = new Person("Emily Brown", 35);
            people[4] = new Person("David Wilson", 28);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }

        for (Person person : people) {
            if (person != null) {
                int value = MathUtils.add(person.getAge(), b);
                person.sendMessage("The value for " + person.getName() + " is: " + value);
            }
        }
    }
}