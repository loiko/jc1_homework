package part5;

public class Task20 {
    public static void main(String[] args) {

        int[] array = new int[10];
        array[0] = 1453;
        array[1] = 45;
        array[2] = 742;
        array[3] = 56;
        array[4] = 123564;
        array[5] = 8465;
        array[6] = 3457;
        array[7] = 14674;
        array[8] = 935;
        array[9] = 6514446;

        System.out.println("Элементы массива с четным индексом:");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("[" + i + "] = " + array[i]);
            }
        }
    }
}
