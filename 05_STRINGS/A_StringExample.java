
class A_StringExample {
    
    public static void main(String[] args) {
        
        String s1 = "Batman";
        String s2 = "Batman";
        String s3 = new String("Batman");
        String s4 = "Superman";

        System.out.println(s1 == s2);      // true (same object in string pool)
        System.out.println(s1 == s3);      // false (s3 is a new object in heap)
        System.out.println(s1.equals(s3)); // true (same content)
        System.out.println(s1 == s4);      // false (different content and reference)
        System.out.println(s1.equals(s4)); // false (content not equal)
    }
}
