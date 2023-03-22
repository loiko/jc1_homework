package part2.task5;

public class FirstMethod {

    public static void main(String[] args) {
        int result = getResult(47, 85);
        System.out.println(result);

    }

    private static int getResult(int a, int b) {
        return (a + b) + (a * b);

    }
}
