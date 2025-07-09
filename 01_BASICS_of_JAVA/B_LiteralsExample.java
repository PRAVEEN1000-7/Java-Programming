public class B_LiteralsExample {
    public static void main(String[] args) {
        // Integer Literals
        int decimal = 100;       // Decimal literal
        int octal = 010;         // Octal literal (010 in octal = 8 in decimal)
        int hex = 0x1A;          // Hexadecimal literal (0x1A = 26 in decimal)

        // Floating-point Literals
        float pi = 3.14f;        // Float literal (note the 'f')
        double gravity = 9.81;   // Double literal

        // Character Literal
        char grade = 'A';        // Character literal

        // String Literal
        String message = "Java is awesome!";  // String literal

        // Boolean Literals
        boolean isJavaFun = true;
        boolean isTough = false;

        // Null Literal
        String nothing = null;   // Null literal

        // Print all values
        System.out.println("Integer Literals: " + decimal + ", " + octal + ", " + hex);
        System.out.println("Floating-point Literals: " + pi + ", " + gravity);
        System.out.println("Character Literal: " + grade);
        System.out.println("String Literal: " + message);
        System.out.println("Boolean Literals: " + isJavaFun + ", " + isTough);
        System.out.println("Null Literal: " + nothing);
    }
}
