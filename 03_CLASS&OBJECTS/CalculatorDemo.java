// This code demonstrates a simple design of Class and Object in Java.
// It defines a Calculator class with an add method and uses it in the main method.
class Calculator {
    
    // Methods --> functions & behaviours of the class
    // this block of code defines a method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        
    int n1=10;
    int n2=20;
    Calculator calc = new Calculator();
    int sum = calc.add(n1, n2);
    System.out.println("Sum of " + n1 + " and " + n2 + " is: " + sum);
    }
}
