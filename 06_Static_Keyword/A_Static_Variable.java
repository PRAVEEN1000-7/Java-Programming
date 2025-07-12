

class static1 {
    static int var = 10; // common for all objects (shared memory) .
    
    void show(){
        System.out.println(var);
    }
}
public class A_Static_Variable {
    public static void main(String[] args) {

        System.out.println(static1.var); // can be called with class name.

        static1 s1 = new static1();

        s1.var++; // incrementing static variable

        System.out.println(s1.var);
        System.out.println(static1.var);
        static1.var++; // incrementing static variable
        s1.show();


    }
}
