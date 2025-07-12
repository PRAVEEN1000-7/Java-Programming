class static2 {

    static int var = 10; // static variable.
    int var2 = 5;   // instance variable

    static void show(){ // static method
        System.out.println(var);
        // System.out.println(var2); --> Cannot use nonStaticVar here directly
    }

    void display(){ // non-static method
        System.out.println(var);    // allowed
        System.out.println(var2);   // allowed
    }
}
public class B_Static_Method {

    public static void main(String[] args) {
        
        static2.show(); // static method can be called without object.
        
        static2 s = new static2();
        s.display(); // non-static method used only with object.

    }
    
}
