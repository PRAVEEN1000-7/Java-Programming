public class A_DataTypesAndVariables {
    
    public static void main(String[] args) {
    
    //primitve type:
        //whole numbers :
        
        boolean bool = true;

        byte bt = 120;

        short sht = 32767;

        int num = 1223333;

        long lg = 123456563465544545L; // for long initializing we have to give 'L' at end.

        // fractional :

        float dec = 3.1415f; // for float initializing we have to give 'f' at end.

        double db = 3.141592653589793; // double can store upto 15 digits of decimals.

        // letters & symbols:

        char a = '$';
    //reference type:    
        String str = "hello, world";
    
    System.out.println(" min and max values of datatypes:");
    System.out.println("int :"+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
    System.out.println("boolean :"+Boolean.FALSE);
    System.out.println("byte :"+Byte.MAX_VALUE);
    
    System.out.println("boolean :"+bool);
    System.out.println("byte :"+bt);
    System.out.println("short :"+sht);
    System.out.println("int :"+num);
    System.out.println("long :"+lg);
    System.out.println("float :"+dec);
    System.out.println("double :"+db);
    System.out.println("char :"+a);
    System.out.println("String :"+str);
    }
}