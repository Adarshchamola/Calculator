import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) {
            double num1, num2, result;
            char operator;

            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            switch (operator) 
            {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) 
                    {
                        System.out.println("Error: Cannot divide by zero");
                        return;
                    } 
                    else 
                    {
                        result = num1 / num2;
                        break;
                    }
                default:
                    System.out.println("Error: Invalid operator");
                    return;
            }

            System.out.printf("%.2f %c %.2f = %.2f", num1, operator, num2, result);
        }
    }
}
