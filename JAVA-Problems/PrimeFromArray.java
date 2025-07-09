public class PrimeFromArray {

    static boolean isPrime(int n){
        if (n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if (n%i==0) return false;
        }
        return true;
    }

    static int[] getPrime(int[] arr){

        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        int[] prime = new int[count];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                prime[index++] = arr[i];
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Prime numbers in the array:");
        int[] primes = getPrime(arr);
        for(int n : primes){
            System.out.print(n+" ");
        }
        
    }
}
