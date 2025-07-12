public class C_StringMethods {
    public static void main(String[] args) {
        String str = " Batman ";
        
        System.out.println("Length: " + str.length());                 // 8

        System.out.println("Char at index 2: " + str.charAt(2));       // t

        System.out.println("Substring(1,5): " + str.substring(1, 5));  // Batm

        System.out.println("Index of 'a': " + str.indexOf('a'));       // 2

        System.out.println("Last index of 'a': " + str.lastIndexOf('a')); // 5

        System.out.println("Equals: " + str.equals(" Batman "));       // true
        
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(" batman ")); // true

        System.out.println("CompareTo: " + str.compareTo(" Antman ")); // Positive value

        System.out.println("Contains 'man': " + str.contains("man"));  // true

        System.out.println("Starts with ' B': " + str.startsWith(" B")); // true

        System.out.println("Ends with 'n ': " + str.endsWith("n "));   // true

        System.out.println("To Upper: " + str.toUpperCase());          // " BATMAN "

        System.out.println("To Lower: " + str.toLowerCase());          // " batman "

        System.out.println("Trimmed: " + str.trim());                  // "Batman"

        System.out.println("Replace: " + str.replace('a', 'o'));       // " Botmon "

        String[] parts = str.split(" ");
        System.out.println("Split: " + parts[1]);                      // Batman

        char[] chArr = str.toCharArray();
        System.out.println("Char Array: " + chArr[1]);                 // B
        
        System.out.println("Is Empty: " + str.isEmpty());              // false
    }
}
