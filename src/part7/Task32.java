package part7;

public class Task32 {
    public static void main(String[] args) {
        long startTime, endTime;
        int iterations = 1000000;
        String string = "aaabbbccc";

        startTime = System.currentTimeMillis();
        String string2 = "";
        for (int i = 0; i < iterations; i++) {
            string2 += string;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Using String: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            strBuilder.append(string);
        }
        String result = strBuilder.toString();
        endTime = System.currentTimeMillis();
        System.out.println("Using StringBuilder: " + (endTime - startTime) + " ms");
    }
}
