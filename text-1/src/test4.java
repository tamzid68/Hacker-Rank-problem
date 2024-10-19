import java.util.Scanner;
/**
 *@author ASM
 */
public class test4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        scan.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + a * i);
        }
    }
}

