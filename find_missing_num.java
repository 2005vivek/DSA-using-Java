public class find_missing_num{
    public static void main(String[] args){
       int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10}; // Example array with a missing number
       int n = arr.length + 1; // Total numbers including the missing one
       int ans = n * (n+1) / 2; // Sum of the elements in the array
       for(int i=0; i < arr.length; i++){
           ans -= arr[i]; // Subtract each element from the sum
       }
       System.out.println("The missing number is: " + Math.abs(ans)); // Print the missing number

    }
}