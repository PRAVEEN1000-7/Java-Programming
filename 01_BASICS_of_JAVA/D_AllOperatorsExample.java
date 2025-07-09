public class D_AllOperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 5, c;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // 15
        System.out.println("a - b = " + (a - b)); // 5
        System.out.println("a * b = " + (a * b)); // 50
        System.out.println("a / b = " + (a / b)); // 2
        System.out.println("a % b = " + (a % b)); // 0

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b)); // false
        System.out.println("a != b : " + (a != b)); // true
        System.out.println("a > b  : " + (a > b));  // true
        System.out.println("a < b  : " + (a < b));  // false
        System.out.println("a >= b : " + (a >= b)); // true
        System.out.println("a <= b : " + (a <= b)); // false

        // 3. Logical Operators
        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y : " + (x && y)); // false
        System.out.println("x || y : " + (x || y)); // true
        System.out.println("!x     : " + (!x));     // false

        // 4. Assignment Operators
        System.out.println("\nAssignment Operators:");
        c = a; // c = 10
        System.out.println("c = " + c);
        c += 5; // c = c + 5 = 15
        System.out.println("c += 5 : " + c);
        c -= 3; // c = c - 3 = 12
        System.out.println("c -= 3 : " + c);
        c *= 2; // c = c * 2 = 24
        System.out.println("c *= 2 : " + c);
        c /= 4; // c = c / 4 = 6
        System.out.println("c /= 4 : " + c);
        c %= 5; // c = c % 5 = 1
        System.out.println("c %= 5 :" + c);

        // 5. Unary Operators (pre/post increment & decrement)
        System.out.println("\nUnary Operators:");
        int num = 5;
        System.out.println("num = " + num);      // 5
        System.out.println("num++ = " + (num++)); // 5 → then becomes 6
        System.out.println("After num++: " + num); // 6
        System.out.println("++num = " + (++num)); // 7 (increased first)
        System.out.println("num-- = " + (num--)); // 7 → then becomes 6
        System.out.println("After num--: " + num); // 6
        System.out.println("--num = " + (--num)); // 5

        // 6. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int p = 5;  // 0101
        int q = 3;  // 0011
        System.out.println("p & q = " + (p & q)); // 1
        System.out.println("p | q = " + (p | q)); // 7
        System.out.println("p ^ q = " + (p ^ q)); // 6
        System.out.println("~p = " + (~p));       // -6
        System.out.println("p << 1 = " + (p << 1)); // 10
        System.out.println("p >> 1 = " + (p >> 1)); // 2

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);

        // 8. instanceof Operator
        System.out.println("\ninstanceof Operator:");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
    }
}
