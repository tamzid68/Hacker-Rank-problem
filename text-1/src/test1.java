import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");
        int n = sc.nextInt();
        boolean ans=true;
        int i=0;
        for(i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                ans=false;
                break;
            }
        }
        System.out.println(ans);
        System.out.println(i);

    }
}
