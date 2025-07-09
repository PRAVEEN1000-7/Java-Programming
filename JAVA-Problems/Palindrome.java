
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a string to check if it is a palindrome:");
            String str = sc.nextLine();

            int start = 0;
            int end = str.length() - 1;

            boolean isPalindrome = true;
            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }   
            if (isPalindrome) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
}