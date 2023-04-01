package part3;

public class Task10 {
    public static void main(String[] args) {

        int day = 30, month = 4, year = 2023;

        boolean isLeapYear = (year > 1584 && ((year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0)));

        if (day == 29 && month == 2 && isLeapYear) {
            day = 1;
            month++;
        } else if (day == 28 && month == 2 && !isLeapYear) {
            day = 1;
            month++;
        } else if ((day == 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            day = 1;
            month++;
        } else if ((day == 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = 1;
            month++;
        } else if ((day == 31) && month == 12) {
            day = 1;
            month = 1;
            year++;
        } else {
            day++;
        }

        if ((month < 10) && (day < 10)) {
            System.out.println("Дата следующего дня: 0" + day + ".0" + month + "." + year);
        } else if (((day <= 0 || day > 31) || (month <= 0 || month > 12)) ||
                ((day > 29 && month == 2 && isLeapYear) || (day > 28 && month == 2 && !isLeapYear))) {
            System.out.println("Невеверная дата");
        } else if (month < 10) {
            System.out.println("Дата следующего дня: " + day + ".0" + month + "." + year);
        } else if (day < 10) {
            System.out.println("Дата следующего дня: 0" + day + "." + month + "." + year);
        } else {
            System.out.print("Дата следующего дня: " + day + "." + month + "." + year);
        }
    }
}
