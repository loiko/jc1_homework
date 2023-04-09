package part6.task25;

public class Main {
    public static void main(String[] args) {

        Time interval1 = new Time(758);
        Time interval2 = new Time(00, 12, 38);

        System.out.println("Total number of seconds of the first interval: " + interval1.getTotalSeconds());
        System.out.println("Total number of seconds of another interval: " + interval2.getTotalSeconds());
        System.out.println();

        int i = interval1.compareTo(interval2);
        System.out.println("Result of comparison of the first and another intervals: " + i);
        if (i == 0) {
            System.out.println("The first interval and the other interval are equal");
        } else {
            System.out.println("The first interval and the other interval are not equal");
        }
        System.out.println();

        interval1.conversions();

    }
}
