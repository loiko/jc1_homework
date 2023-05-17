package part12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {

        String destinationFolderPath = "c:\\FileTasks";
        createFolders(destinationFolderPath, 3);
        createFiles(destinationFolderPath, 5, 10);
        consolidateFiles(destinationFolderPath);
        createFileList(destinationFolderPath);
    }

    private static void createFolders(String destinationFolderPath, int numFolders) {
        File destinationFolder = new File(destinationFolderPath);
        if (!destinationFolder.exists()) {
            boolean success = destinationFolder.mkdirs();
            if (!success) {
                System.out.println("Failed to create destination folders.");
                return;
            }
        }
        for (int i = 1; i <= numFolders; i++) {
            String folderPath = destinationFolderPath + "/folder" + i;
            File folder = new File(folderPath);
            boolean success = folder.mkdir();
            if (!success) {
                System.out.println("Failed to create folder: " + folderPath);
            }
        }
    }

    private static void createFiles(String destinationFolderPath, int numFiles, int numbersPerFile) {
        Random random = new Random();
        for (int i = 1; i <= numFiles; i++) {
            String filePath = destinationFolderPath + "/file" + i + ".txt";
            try (PrintWriter writer = new PrintWriter(filePath)) {
                for (int j = 1; j <= numbersPerFile; j++) {
                    int number = random.nextInt(100);
                    writer.println(number);
                }
            } catch (IOException e) {
                System.out.println("Failed to create file: " + filePath);
            }
        }
    }

    private static void consolidateFiles(String destinationFolderPath) {
        String consolidatedFilePath = destinationFolderPath + "/consolidated.txt";
        try (PrintWriter writer = new PrintWriter(consolidatedFilePath)) {
            File destinationFolder = new File(destinationFolderPath);
            File[] files = destinationFolder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && !file.getName().equals("consolidated.txt")) {
                        try (Scanner scanner = new Scanner(file)) {
                            while (scanner.hasNextLine()) {
                                String line = scanner.nextLine();
                                writer.println(line);
                            }
                        } catch (IOException e) {
                            System.out.println("Failed to read file: " + file.getName());
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Failed to create consolidated file");
        }
    }

    private static void createFileList(String destinationFolderPath) {
        String fileListPath = destinationFolderPath + "/filelist.txt";
        try (PrintWriter writer = new PrintWriter(fileListPath)) {
            File destinationFolder = new File(destinationFolderPath);
            File[] files = destinationFolder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        writer.println(file.getName());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Failed to create file list");
        }
    }
}
