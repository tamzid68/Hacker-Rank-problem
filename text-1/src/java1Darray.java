import java.util.Scanner;

public class java1Darray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = scan.nextInt();
        }
        scan.close();

    }
}
