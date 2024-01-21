package oops4;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator App");

        while (true) {
            System.out.print("Enter an operation (+, -, *, /) or 'exit' to quit: ");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Calculator app is exiting. Goodbye!");
                break;
            }

            if (!operation.matches("[+\\-*/]")) {
                System.out.println("Invalid operation. Please enter +, -, *, or /.");
                continue;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = 0.0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero.");
                        continue;
                    }
                    break;
            }

            System.out.println("Result: " + result);
            scanner.nextLine(); // Consume newline
        }

    
    }
}

	


