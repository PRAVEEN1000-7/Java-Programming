public class Fibonacci {
    static void fibonacci(int n) {
        
        int a=0, b=1, c;
        System.out.print("Fibonacci series up to " + n + ": "+a+ " " +b);
        for (int i = 2; i <n; i++) {
            c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int n = 10; 
        fibonacci(n);
    }
}
