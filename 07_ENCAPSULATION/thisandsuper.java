class A {

    A(){
        System.out.println("A constructor");
    }

    A(int n){
        this();
        System.out.println("A constructor with parameter - "+n);
    }

}
class B extends A {
    
    B(){
        System.out.println("B constructor");
    }

    B(int n){
        super();
        
        System.out.println("B constructor with parameter - "+n);
    }
}

public class thisandsuper {
    
    public static void main(String[] args) {
        
    A a = new A(7);
    B b = new B(5);
        
    }
}
