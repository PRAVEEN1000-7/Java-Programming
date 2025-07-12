public class E_StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Flash");

        sb.append(" Hero");                       // Flash Hero
        System.out.println("Append: " + sb);

        sb.insert(6, "Speed ");                   // Flash Speed Hero
        System.out.println("Insert: " + sb);

        sb.replace(6, 11, "Quick ");              // Flash Quick Hero
        System.out.println("Replace: " + sb);

        sb.delete(6, 12);                         // Flash Hero
        System.out.println("Delete: " + sb);

        sb.deleteCharAt(0);                       // lash Hero
        System.out.println("DeleteCharAt: " + sb);

        sb.reverse();                             // oreH hs al
        System.out.println("Reverse: " + sb);

        System.out.println("Length: " + sb.length());       // 9
        System.out.println("Capacity: " + sb.capacity());   // default 16 + string length

        System.out.println("CharAt(2): " + sb.charAt(2));   // e
        sb.setCharAt(2, 'X');
        System.out.println("SetCharAt(2): " + sb);          // updated char

        System.out.println("Substring(1,4): " + sb.substring(1, 4));
    }
}
