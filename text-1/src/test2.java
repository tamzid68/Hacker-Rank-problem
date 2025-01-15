import java.sql.SQLOutput;
import java.util.Scanner;
public class test2 {
    public static void main(String [] args){
       StringBuilder sb = new StringBuilder("Hello");

       for(int i=0; i<sb.length()/2; i++){
           int last = sb.length()-1-i;
           int font = i;

           char fontChar = sb.charAt(font);
           char lastChar = sb.charAt(last);

           sb.setCharAt(last, fontChar);
           sb.setCharAt(font, lastChar);
       }
        System.out.println(sb);

    }
}
