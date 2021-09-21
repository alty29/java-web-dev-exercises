package exercises;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        double width;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the length in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        input = new Scanner(System.in);
        System.out.println("Enter the width: ");
        width = input.nextDouble();
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}