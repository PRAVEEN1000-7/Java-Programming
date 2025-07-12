
class Static3 {

    static {
        System.out.println("Static block: class loaded"); // run once when class is loaded ( used for initialization).
    }
}

public class C_Static_Block {
    
    public static void main(String[] args) {
        
        try {
            Class.forName("Static3");       //or     Static3 s = new Static3();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e);
        }
        


    }
    
}
