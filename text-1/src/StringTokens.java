//import java.io.*;
import java.util.*;
/**
 *@author ASM
 */
public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s=s.trim();

        if(s.length()==0){
            System.out.println(0);
            return;
        }
        String[] word = s.split("[^A-Za-z]+");
        System.out.println(word.length);
        for(String words: word)
            System.out.println(words);



    }
}

