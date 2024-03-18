import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 1; count < n; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println("The sum of the first " + n + " even numbers is: " + sum);
        scanner.close();
    }
}
