// loop2
import java.util.Scanner;

public class test5 {
    public static void generateSeries(int a,int b,int n)
    {
        int currentSum = 0;
        for(int i=0;i<n;i++)
        {
            currentSum +=b*(1<<i);
            System.out.print((a+currentSum)+" ");
        }
        System.out.println();
    }
    public static void main(String []  args)
    {
        Scanner scan = new Scanner(System.in);

        int Q=scan.nextInt();

        for(int i=0;i<Q;i++)
        {
            int a=scan.nextInt();
            int b=scan.nextInt();
            int n=scan.nextInt();

            generateSeries(a,b,n);
        }
    }

}