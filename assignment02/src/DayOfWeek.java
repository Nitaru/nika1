import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the numeric day of the week
        System.out.print("Enter the numeric day of the week (1-7): ");
        int dayOfWeek = scanner.nextInt();

        // Convert numeric day of the week to its corresponding name
        String dayName;
        switch (dayOfWeek) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid input.";
        }

        // Output the corresponding day name or "Invalid input."
        System.out.println("The day of the week is: " + dayName);

        scanner.close();
    }
}
