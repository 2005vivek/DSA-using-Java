import java.util.*;

public class ReverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr.length-1;

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Reversing the array
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}