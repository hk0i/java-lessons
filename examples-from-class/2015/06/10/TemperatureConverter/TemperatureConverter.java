import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        double inputTemp = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter degrees Celsius: ");

        while(!input.hasNextDouble()) {
            System.out.print("Enter degrees Celsius: ");
            input.nextLine();
        }
        inputTemp = input.nextDouble();

        double fahrenheit = celsiusToFahrenheit(inputTemp);
        System.out.println(fahrenheit);
    }
}
