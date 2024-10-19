import java.util.Scanner;

public class StringReverse {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String F = sc.next();
        sc.close();

        StringBuilder resve = new StringBuilder();

        for(int i=F.length()-1;i>=0;i--)
            resve.append(F.charAt(i));

        if(F.equals(resve.toString()))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
