import company.beans.Person;
import company.utils.MathUtils;
import company.exceptions.*;



public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        final int b = 10;

        try {
            people[0] = new Person("Tommy Hajto", 29);
            people[1] = new Person("Robert Hajto", 25);
            people[2] = new Person("Kapitan Bomba", 38);
            people[3] = new Person("Dwayn Johnson", 34);
            people[4] = new Person("Andrzej Nerwowy", 27);
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