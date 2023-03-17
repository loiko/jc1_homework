package part1.task2;

public class Timing {
    public static void main(String[] args) {
        int s = 3700;
        int sec, m, min, h, hours, d, days, weeks;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hours = h % 24;
        d = (h - hours) / 24;
        days = d % 7;
        weeks = (d - days) / 7;
        System.out.println(weeks + " недель " + days + " дней " + hours + " часов " + min + " минут " + sec + " секунд");
    }
}
