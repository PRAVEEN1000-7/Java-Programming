public class D_StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hero");

        sb.append(" Man");                      // Hero Man
        System.out.println("Append: " + sb);

        sb.insert(5, "Super ");                 // Hero Super Man
        System.out.println("Insert: " + sb);

        sb.replace(5, 10, "Iron ");             // Hero Iron Man
        System.out.println("Replace: " + sb);

        sb.delete(5, 10);                       // Hero Man
        System.out.println("Delete: " + sb);

        sb.deleteCharAt(0);                     // ero Man
        System.out.println("DeleteCharAt: " + sb);

        sb.reverse();                           // naM ore
        System.out.println("Reverse: " + sb);

        System.out.println("Length: " + sb.length());       // 7
        System.out.println("Capacity: " + sb.capacity());   // default 16 + string length

        System.out.println("CharAt(1): " + sb.charAt(1));   // a
        sb.setCharAt(1, 'X');                               // Change char at index 1
        System.out.println("SetCharAt(1): " + sb);

        String sub = sb.substring(1, 4);
        System.out.println("Substring(1,4): " + sub);        // XM 
        System.out.println("ToString: " + sb.toString());    // Updated string
    }
}
