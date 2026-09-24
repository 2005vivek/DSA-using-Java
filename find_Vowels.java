import java.util.*;

class Vowels {
    public void countVowels(String sen) {
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (int i = 0; i < sen.length(); i++) {
            if (vowels.indexOf(sen.charAt(i)) != -1) {
                count++;
            }
        }

        System.out.println("Number of vowels in the sentence: " + count);
    }
}

public class find_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        Vowels vw = new Vowels();   // create object
        vw.countVowels(sentence);   // call method
        sc.close();
    }
}
