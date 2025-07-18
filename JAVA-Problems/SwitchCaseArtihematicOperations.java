import java.util.Scanner;
public class SwitchCaseArtihematicOperations {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in);){  

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter the operation [+, -, *, /]: ");
            char optr = sc.next().charAt(0);

            double result;

            switch (optr) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
            }
        }

    }
}
