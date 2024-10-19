import java.util.Scanner;
/**
 *@author ASM
 */
class Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    // Correct regular expression for matching an IP address
    String reg = "([0-9]{1,2}|(0|1)[0-9]{2}|2[0-4][0-9]|25[0-5])";
    public String pattern = reg + "." + reg + "." + reg + "." + reg;
}