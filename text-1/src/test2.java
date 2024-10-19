import java.util.Scanner;
public class test2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char ch = scan.next().charAt(0);
        System.out.print("Enter Second any character: ");
        char ch1 = scan.next().charAt(0);
        System.out.println("The first character is:" + ch + "\nAnd Second character is:" + ch1);

    }
}
