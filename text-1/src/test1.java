import java.util.Scanner;

public class test1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the user input:");
        int s=scan.nextInt();
        System.out.println(s);

        System.out.print("Enter second number:");
        float sum=scan.nextFloat();
        System.out.println(sum);

        System.out.print("Enter name: ");
        scan.nextLine();
        String nam=scan.nextLine();
        System.out.print(nam);
    }
}
