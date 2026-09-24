public class MovingZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]==0 && arr[right]!=0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(arr[left]!=0){
                left++;
            }
            else if(arr[right]==0){
                right--;
            }
        }
        System.out.println("Array after moving zeroes to the end: ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
