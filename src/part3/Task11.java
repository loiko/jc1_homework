package part3;

public class Task11 {
    public static void main(String[] args) {

        int a = 5, b = 6, c = 13, d = 6, e = 43, f = 35;

        if ((e >= (a + c)) && (f >= b && f >= d)) {
            System.out.println("Дома помещаются на данном участке");
        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            System.out.println("Дома помещаются на данном участке");
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println("Дома помещаются на данном участке");
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println("Дома помещаются на данном участке");
        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println("Дома помещаются на данном участке");
        } else if ((f >= (a + d)) && (e >= b && e >= c)) {
            System.out.println("Дома помещаются на данном участке");
        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            System.out.println("Дома помещаются на данном участке");
        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println("Дома помещаются на данном участке");
        } else
            System.out.println("Дома не помещаются на данном участке");
    }
}

