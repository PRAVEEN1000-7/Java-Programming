
public class B_StringTypesExample {

    public static void main(String[] args) {
        
        // 🔸 String (Immutable)
        String str = "Hello";
        str.concat(" World");  // This will not change str
        System.out.println("String: " + str);  // Output: Hello

        // 🔸 StringBuffer (Mutable + Thread-safe)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf);  // Output: Hello World

        // 🔸 StringBuilder (Mutable + NOT Thread-safe)
        StringBuilder sbd = new StringBuilder("Hello");
        sbd.append(" Java");
        System.out.println("StringBuilder: " + sbd); // Output: Hello Java
    }
    
}
