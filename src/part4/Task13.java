package part4;

public class Task13 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            int n = 1;
            int j = i;
            while (j > 0) {
                n = n * j;
                j--;
            }
            System.out.println(i + "! = " + n);
            i++;
        }
    }
}
