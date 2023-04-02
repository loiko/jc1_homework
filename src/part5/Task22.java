package part5;

import java.util.Arrays;

public class Task22 {
    public static void main(String[] args) {

                int[] array = {45436, 3434, 6, 747, 1122, 8280, 35, 78, 125, 942};

                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = 0; j < array.length - i - 1; j++) {
                        if (array[j] < array[j + 1]) {
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }

                int min = array[array.length - 1];
                int max = array[0];
                int minIndex = array.length - 1;
                int maxIndex = 0;

                for (int i = 0; i < array.length; i++) {
                    if (array[i] < min) {
                        min = array[i];
                        minIndex = i;
                    }
                    if (array[i] > max) {
                        max = array[i];
                        maxIndex = i;
                    }
                }

                int sum = 0;
                if (minIndex < maxIndex) {
                    for (int i = minIndex + 1; i < maxIndex; i++) {
                        sum += array[i];
                    }
                } else if (minIndex > maxIndex) {
                    for (int i = maxIndex + 1; i < minIndex; i++) {
                        sum += array[i];
                    }
                } else {
                    int maxDiff = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] == min || array[i] == max) {
                            continue;
                        }
                        int diff = i > maxIndex ? i - maxIndex : maxIndex - i;
                        if (diff > maxDiff) {
                            maxDiff = diff;
                        }
                    }
                    System.out.println("Максимальное значение разницы индексов " + maxDiff);
                }
                System.out.println("Сумма элементов массива между минимальным и максимальным значением: " + sum);
            }
        }





