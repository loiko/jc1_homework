package part3;

public class Task8 {
    public static void main(String[] args) {

        int a = 5, b = 2, r = 2;

        if (a > b) {
            if (r * 2 >= a) {
                System.out.println("it's possible");
            } else {
                System.out.println("it's impossible");
            }
        }
        if (b > a) {
            if (r * 2 >= b) {
                System.out.println("it's possible");
            } else {
                System.out.println("it's impossible");
            }
        }
    }
}
