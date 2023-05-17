package part12.task52;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Person[] persons = generatePeople(10);
        writeToFile(persons, "persons.txt");

    }

    private static Person[] generatePeople(int count) {
        Person[] persons = new Person[count];
        Random random = new Random();

        String[] names = {"Rick", "Thom", "Thomas", "Walter", "Virginia"};
        String[] surnames = {"Deckard", "Yorke", "Pynchon", "White", "Woolf"};

        for (int i = 0; i < count; i++) {
            String name = names[random.nextInt(names.length)];
            String surname = surnames[random.nextInt(surnames.length)];
            int age = random.nextInt(50) + 18;

            persons[i] = new Person(name, surname, age);
        }

        return persons;
    }

    private static void writeToFile(Person[] persons, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Person person : persons) {
                writer.write(person.getName() + " " + person.getSurname() + ", " + person.getAge());
                writer.newLine();
            }
            System.out.println("File created successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            System.exit(1);
        } finally {
            System.exit(0);
        }

    }
}
