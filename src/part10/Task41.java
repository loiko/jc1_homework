package part10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task41 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            int randomNumbers = (int) (Math.random() * 20);
            list.add(randomNumbers);
        }

        System.out.println("Сollection numbers " + list);

        Set<Integer> uniqueNumbers = new HashSet<>(list);
        list.clear();
        list.addAll(uniqueNumbers);

        System.out.println("Сollection numbers without duplicates " + list);

    }
}
