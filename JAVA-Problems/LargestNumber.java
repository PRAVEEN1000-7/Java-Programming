public class LargestNumber {
    static int largestNumber(int[] arr){
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if (largest<arr[i]){
                largest = arr[i];
            }
        }
        return largest; 
    }
    public static void main(String[] args) {
        
        int[] nums = {10, 2, 11, 9};
        int result = largestNumber(nums);
        System.out.println("The largest number among :"+result); 
    }
}
