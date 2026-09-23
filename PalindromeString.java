import java.util.*;

public class PalindromeString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine().toLowerCase();
        boolean isPalindrome = true;
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                isPalindrome = true;
                left++;
                right--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if (!isPalindrome) {
            System.out.println("The string is not a palindrome.");
        } else {
        System.out.println("The string is a palindrome.");}
    }
}
