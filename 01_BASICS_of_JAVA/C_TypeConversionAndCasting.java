public class C_TypeConversionAndCasting {
    public static void main(String[] args) {
        // Type Conversion (Automatic) - int to double
        int intNum = 50;
        double doubleNum = intNum;  // Automatically converts int to double

        System.out.println("Automatic Type Conversion:");
        System.out.println("int value: " + intNum);
        System.out.println("Converted to double: " + doubleNum);

        // Type Casting (Manual) - double to int
        double pi = 3.14159;
        int approxPi = (int) pi;  // Manually casting double to int

        System.out.println("\nManual Type Casting:");
        System.out.println("double value: " + pi);
        System.out.println("Casted to int: " + approxPi);

        int i = 260;
        byte b = (byte) i;  // Manually casting int to byte [ which will result in data loss ][260%256 = 4, so 'b' will be 4]

        System.out.println("\nManual Type Casting:");
        System.out.println("int value: " + i);
        System.out.println("Casted to byte: " + b);
    }

}
