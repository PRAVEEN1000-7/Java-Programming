
public class LeapYear {

    static boolean getLeapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        
        int[] years = {1600, 1700, 1800, 1900, 2000, 2004, 2010, 2020, 2023, 2024};

        
        System.out.println("Leap years in the array:");
        for (int year : years) {
            if (getLeapYear(year)) {
                
                System.out.print(year + " ");
            }
        }
    }
}
