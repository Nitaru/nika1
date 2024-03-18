import java.util.Scanner;

public class TemperatureClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double temperature = scanner.nextDouble();

        String classification;
        if (temperature < 0) {
            classification = "Freezing";
        } else if (temperature >= 0 && temperature <= 15) {
            classification = "Cold";
        } else if (temperature >= 16 && temperature <= 25) {
            classification = "Mild";
        } else if (temperature >= 26 && temperature <= 35) {
            classification = "Warm";
        } else {
            classification = "Hot";
        }

        // Output the classification
        System.out.println("The temperature is classified as: " + classification);

        scanner.close();
    }
}
