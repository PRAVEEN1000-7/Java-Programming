public class ReplaceNegativewithZero {
    
    public static void main(String[] args){

        int arr[] = {1,-2,3,4,-5,6,-7,9,-0};

        System.out.print("array : ");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            if (arr[i]<0){
                arr[i] = 0;
            }
        }
        System.out.print("after replacing : ");

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        
    }
}
