
public class A_Array {

    public static void main(String[] args) {
        
        int arr1[] = {1,2,3};  // directly with values
        // or int[] arr = {1,2,3};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        int arr2[] = new int[2];// creates array of size 5 (default values: 0)
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        int[] arr3;
        arr3 = new int[3];  // declare first, assign later
        arr3[1] = 7;
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println();

        int[] arr4 =new int[] {1,2,3}; // Using new with values 
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i]+" ");
        }


    }
    
}
