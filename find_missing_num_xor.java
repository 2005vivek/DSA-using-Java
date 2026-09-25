public class find_missing_num_xor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10}; // missing 5
        int n = arr.length + 1; // true range is 1 to n

        int xor1 = 0; // XOR of 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        int xor2 = 0; // XOR of array elements
        for (int num : arr) {
            xor2 ^= num;
        }

        int missing = xor1 ^ xor2;
        System.out.println("The missing number is: " + missing);
    }
}