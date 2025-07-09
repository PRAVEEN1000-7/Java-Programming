class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;

        Calculator calc = new Calculator();
        
        // Calling the add method with two integers
        int sum1 = calc.add(n1, n2);
        System.out.println("Sum of " + n1 + " and " + n2 + " is: " + sum1);
        
        // Calling the add method with three integers
        int sum2 = calc.add(n1, n2, n3);
        System.out.println("Sum of " + n1 + ", " + n2 + ", and " + n3 + " is: " + sum2);

        double d1 = 10.5;
        double d2 = 20.5;       
        // Calling the add method with two doubles
        double sum3 = calc.add(d1, d2);     
        System.out.println("Sum of " + d1 + " and " + d2 + " is: " + sum3);
        double d3 = 30.5;
        // Calling the add method with three doubles    
        double sum4 = calc.add(d1, d2, d3);
        System.out.println("Sum of " + d1 + ", " + d2 + ", and " + d3 + " is: " + sum4);
    }
}
