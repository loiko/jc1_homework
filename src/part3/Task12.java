package part3;

public class Task12 {
    public static void main(String[] args) {

        int timetable = getTimetable(7);
        System.out.println(timetable);
    }

    private static int getTimetable(int day) {

        switch (day) {
            case 1:
                System.out.println("Monday: \n" +
                        "1. Breakfast;\n" +
                        "2. Learning Java;\n" +
                        "3. Lunch;\n" +
                        "4. Learning Java;\n" +
                        "5. Dinner;\n" +
                        "6. Learning Java;\n" +
                        "7. Sleep.");
                break;
            case 2:
                System.out.println("Tuesday: \n" +
                        "1. Breakfast;\n" +
                        "2. Learning Java;\n" +
                        "3. Lunch;\n" +
                        "4. Learning Java;\n" +
                        "5. Dinner;\n" +
                        "6. Learning Java;\n" +
                        "7. Sleep.");
                break;
            case 3:
                System.out.println("Wednesday : \n" +
                        "1. Breakfast;\n" +
                        "2. Learning Java;\n" +
                        "3. Lunch;\n" +
                        "4. Learning Java;\n" +
                        "5. Dinner;\n" +
                        "6. Learning Java;\n" +
                        "7. Sleep.");
                break;
            case 4:
                System.out.println("Thursday : \n" +
                        "1. Breakfast;\n" +
                        "2. Learning Java;\n" +
                        "3. Lunch;\n" +
                        "4. Learning Java;\n" +
                        "5. Dinner;\n" +
                        "6. Learning Java;\n" +
                        "7. Sleep.");
                break;
            case 5:
                System.out.println("Friday : \n" +
                        "1. Breakfast;\n" +
                        "2. Learning Java;\n" +
                        "3. Lunch;\n" +
                        "4. Learning Java;\n" +
                        "5. Dinner;\n" +
                        "6. Learning Java;\n" +
                        "7. Sleep.");
                break;
            case 6:
                System.out.println("Saturday : \n" +
                        "1. Breakfast;\n" +
                        "2. Learning Java;\n" +
                        "3. Lunch;\n" +
                        "4. Learning Java;\n" +
                        "5. Dinner;\n" +
                        "6. А little rest;\n" +
                        "7. Sleep.");
                break;
            case 7:
                System.out.println("Sunday: \n" +
                        "1. Breakfast;\n" +
                        "2. Learning Java;\n" +
                        "3. Lunch;\n" +
                        "4. Learning Java;\n" +
                        "5. Dinner;\n" +
                        "6. Learning Java;\n" +
                        "7. Sleep.");
                break;
            default:
                System.out.println("Please enter a valid day of the week");
        }
        return day;
    }
}