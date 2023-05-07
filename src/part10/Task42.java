package part10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task42 {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            int randomGrade = (int) (Math.random() * 11);
            grades.add(randomGrade);
        }

        System.out.println("All student grades: " + grades);

        int highestScore = 0;
        Iterator<Integer> iterator = grades.iterator();
        while (iterator.hasNext()) {
            int grade = iterator.next();
            if (grade > highestScore) {
                highestScore = grade;
            }
        }

        System.out.println("The highest score: " + highestScore);
    }
}