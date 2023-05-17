package part11;

public class Task44 {
    public static void main(String[] args) {

        try {
            String name = null;
            name.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException description: " + e.getMessage());
            System.exit(1);
        } finally {
            System.exit(0);
        }

    }
}
