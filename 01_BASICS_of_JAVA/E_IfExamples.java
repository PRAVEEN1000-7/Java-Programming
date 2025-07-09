public class E_IfExamples {
    public static void main(String[] args) {
        int marks = 72;
        int age = 17;

        // 1. if statement
        if (marks > 90) {
            System.out.println("Wow! You scored above 90!");
        }

        // 2. if...else statement
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // 3. if...else if...else statement
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
