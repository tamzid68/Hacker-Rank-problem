import java.util.Scanner;

public class test11 {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int s=scan.nextInt();

        try{
            String x = Integer.toString(s);
            System.out.println("Good job");
        }
        catch(Exception e) {
        System.out.println("Wrong answer");
        }
        }
    }

