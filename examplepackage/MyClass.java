package examplepackage;

public class MyClass {
    private int a = 10;        // only inside this class
    int b = 20;                // default: package only
    protected int c = 30;      // package + subclass
    public int d = 40;         // everywhere

    public void showValues() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
