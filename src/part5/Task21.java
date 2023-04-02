package part5;

public class Task21 {
    public static void main(String[] args) {

        int[] array = {6443, 97432688, 43679, 34583, 3, 774, 74421, 278, 2, 23624};
        int max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальное элемент массива: array[" + maxIndex + "] = " + max);
    }
}
