import java.util.Scanner;
class ReverseString {

    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter the String:");
            String str = sc.nextLine();
            String str2 = "";
            for(int i=str.length()-1;i>=0;i--){
                str2 += str.charAt(i);
            }
            System.out.println("Reversed String: " + str2);
        }
    }
}