package part12;

import java.io.File;

public class Task47 {
    public static void main(String[] args) {

        String path = "c:\\jc1_homework";
        File directory = new File(path);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                System.out.println("Directories:");
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println(file.getName());
                    }
                }

                System.out.println("\nFiles:");
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.out.println("The directory is empty");
            }
        } else {
            System.out.println("The specified directory does not exist");
        }

    }
}

