package part16.task63;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = generatePeople(100, 15, 30);
        List<String> surnames = people.stream()
                .filter(p -> p.getAge() < 21)
                .peek(person -> System.out.println(person.getName() + " " + person.getSurname() + ", " + person.getAge()))
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList());

        System.out.println("\nCollected surnames: " + surnames);
    }

    private static List<Person> generatePeople(int count, int minAge, int maxAge) {

        List<Person> people = new ArrayList<>();
        Random random = new Random();

        String[] names = {"Michael", "Dwight", "Jim", "Pam", "Ryan", "Andy"};
        String[] surnames = {"Scott", "Schrute", "Halpert", "Beesly", "Howard", "Bernard"};

        for (int i = 0; i < count; i++) {
            String name = names[random.nextInt(names.length)];
            String surname = surnames[random.nextInt(surnames.length)];
            int age = random.nextInt(maxAge - minAge + 1) + minAge;

            people.add(new Person(name, surname, age));
        }

        return people;

    }
}
