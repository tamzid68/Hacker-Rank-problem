import java.io.*;
import java.util.*;
import java.math.*;
public class JavaBigInteger {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());

            System.out.println(a.add(b)+"\n"+a.multiply(b));

        }
    }
