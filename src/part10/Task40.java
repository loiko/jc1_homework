package part10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task40 {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            int randomGrade = (int) (Math.random() * 11);
            grades.add(randomGrade);
        }

        System.out.println("All student grades: " + grades);

        Iterator<Integer> iterator = grades.iterator();
        while (iterator.hasNext()) {
            int grade = iterator.next();
            if (grade <= 3) {
                iterator.remove();
            }
        }

        System.out.println("Student grades after removing unsatisfactory: " + grades);
    }
}
