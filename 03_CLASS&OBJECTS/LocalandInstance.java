class Student {
    // 🔵 Instance variable (default initialized to null)
    String name;

    void display() {
        // 🔴 Local variable (must be manually initialized before use)
        String message;  // Declared but NOT initialized — using it will cause error

        // Uncommenting below line will cause compile-time error
        // System.out.println(message);  //  Error: variable message might not have been initialized

        System.out.println(name);  // ✅ Works — instance variable is auto-initialized to null
    }
}

public class LocalandInstance {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
