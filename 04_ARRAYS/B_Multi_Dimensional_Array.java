class B_Multi_Dimensional_Array {
    
    public static void main(String[] args) {

    
    int[][] MDarr = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};

    // with size : int[][] MDarr = new int[3][3];

    for(int i=0;i<MDarr.length;i++){
        for(int j=0;j<MDarr.length;j++){
            System.out.print(MDarr[i][j]+" ");
        }
        System.out.println();
    }   
    }
}
