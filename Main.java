
import examplepackage.MyClass;

public class Main extends MyClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        // System.out.println(obj.a); //  private
        // System.out.println(obj.b); //  default
        // System.out.println(obj.c); //  protected (not allowed via object in diff package)
        System.out.println(obj.d);    //  public

        Main m = new Main();
        System.out.println(m.c); //  protected: allowed via inheritance
    }
}
