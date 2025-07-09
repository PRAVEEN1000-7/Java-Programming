import java.util.Scanner;
public class StudentGrade {
    
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the percentage:");
            int per = sc.nextInt();

            if (per>=90)
                System.out.println("you're grade : A");
            else if (per<90 && per<=70)
                System.out.println("you're grade : B");
            else if (per<80 && per<60)
                System.out.println("you're grade : C");
            else if (per<60 && per<50)
                System.out.println("you're grade : D");
            else if (per<50 && per>30)
                System.out.println("you're grade : E");
            else if (per<30)
                System.out.println("you're fail");
            else 
                System.out.println("invalid percentage.");
            
        }
    }
}
