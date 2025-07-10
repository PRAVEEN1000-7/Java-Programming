public class D_Array3D {
    public static void main(String[] args) {
            int[][][] arr = {
                {
                    {1, 2}, 
                    {3, 4}
                },
                {
                    {5, 6}, 
                    {7, 8}
                }
            };

            // Print all elements
            for (int i = 0; i < arr.length; i++) {             // Pages
                System.out.println("---- Page : " + i+"----");
                for (int j = 0; j < arr[i].length; j++) {      // Rows
                    for (int k = 0; k < arr[i][j].length; k++) { // Columns
                        System.out.print(arr[i][j][k] + " ");
                    }
                    System.out.println(); // New row
                }
                
            }
        }   
}
