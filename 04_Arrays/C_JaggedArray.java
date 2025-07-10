

class C_jaggedArray {

    public static void main(String[] args) {
        
        int[][] jarr = new int[3][];

        jarr[0] = new int[] {1,2,3};
        jarr[1] = new int[] {4,5,6,7};
        jarr[2] = new int[3];

        jarr[2][0] = 8;
        jarr[2][1] = 9;
        jarr[2][2] = 10;

        for(int row[] : jarr){

            for(int element : row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        
    }
}