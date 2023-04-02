package part5;

public class Task23 {
    public static void main(String[] args) {

        int[] array = {43, 35, 72, 4, 973, 357, 237, 542, 18, 53};

        System.out.println("Массив array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Массив array в обратном порядке:");
        for (int i = 0; i < array.length / 2; i++) {
            int value = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = value;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


