import java.util.Scanner;
public class Factorial {
    static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers do not have a factorial.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            System.out.print("Enter a non-negative integer: ");
            int n = sc.nextInt();
            long result = factorial(n);
            System.out.println("Factorial of " + n + " is: " + result);
        }
    }
}
