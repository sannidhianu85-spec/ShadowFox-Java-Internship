import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== JAVA CALCULATOR =====");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose Operation");
        System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Multiplication");
System.out.println("4. Division");
System.out.println("5. Square Root");
System.out.println("6. Power");
System.out.println("7. Celsius to Fahrenheit");
System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Result = " + (num1 + num2));
                break;

            case 2:
                System.out.println("Result = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Result = " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
                case 5:
    System.out.println("Square Root of " + num1 + " = " + Math.sqrt(num1));
    break;

case 6:
    System.out.println("Result = " + Math.pow(num1, num2));
    break;

case 7:
    double fahrenheit = (num1 * 9 / 5) + 32;
    System.out.println("Temperature = " + fahrenheit + " °F");
    break;

case 8:
    System.out.println("Thank you for using the calculator!");
    break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}