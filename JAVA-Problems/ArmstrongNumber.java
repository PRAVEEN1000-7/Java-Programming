import java.util.Scanner;
public class ArmstrongNumber {
    
    static int Powerof(int digit,int power){
        int result =1;
        for(int i=0;i<power;i++){
            result*=digit ;
        }
        return result;
    }

    static boolean checkArmstrong(int num) {
    
            int digits=0,temp=num;
            while (temp>0){
                digits++;
                temp/=10;
            }
            

            int sum=0,original=num;
            while (num > 0) {
                int digit = num % 10;
                sum += Powerof(digit, digits);
                num /= 10;
            }
            return sum==original;

    }
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (checkArmstrong(num)) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }
        }
    }
}
