package part4;

public class Task14 {
    public static void main(String[] args) {
        double product = 1;
        int i = 1;
        do {
            product = product * i;
            i++;
        } while (i <= 25);
        System.out.println("Произведение чисел от 1 до 25 равняется " + product);
    }
}
