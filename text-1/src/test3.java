import java.util.Scanner;

public class test3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading 3 integers from the standard input
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Closing the scanner
        scanner.close();

        // Printing each integer on a new line
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
