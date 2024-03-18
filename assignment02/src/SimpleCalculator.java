import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt user for the command
            System.out.print("Enter command (e.g., add 5 3, subtract 10 4, multiply 2 3, divide 8 2): ");
            String command = scanner.nextLine();

            String[] parts = command.split(" ");

            if (parts.length != 3) {
                System.out.println("Invalid command format. Please provide a valid command.");
                continue;
            }

            String operation = parts[0];
            double num1, num2;
            try {
                num1 = Double.parseDouble(parts[1]);
                num2 = Double.parseDouble(parts[2]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid numbers provided. Please provide valid numbers.");
                continue;
            }

            double result;

            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "subtract":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
                case "divide":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }
}
