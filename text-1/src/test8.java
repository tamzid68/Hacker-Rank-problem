//end of file
import java.util.Scanner;

public class test8{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int number = 1;

        while(scan.hasNext())
        {
            String line = scan.nextLine();
            System.out.println(number+" "+line);
            number++;
        }

    }
}