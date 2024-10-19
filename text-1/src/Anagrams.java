import java.util.Scanner;
/**
 *@author ASM
 */
public class Anagrams {

    static boolean isAnagram(String a, String b) {
        String a_case = a.toLowerCase();
        String b_case = b.toLowerCase();

        int a_length=a_case.length();
        int b_length=b_case.length();
        int[] freq = new int[26];
        if(a_length!=b_length)
            return false;

        for(int j=0;j<a_length;j++)
            freq[a_case.charAt(j)-'a']++;

        for(int i=0;i<b_length;i++)
            freq[b_case.charAt(i)-'a']--;

        for(int w=0;w<26;w++)
        {
            if(freq[w]!=0)
                return false;
        }

        // Compare the sorted char arrays
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
