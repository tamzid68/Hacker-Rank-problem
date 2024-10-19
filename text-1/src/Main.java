import java.io.*;

public class Main {
    public static void main(String[] args) {
    int roll;
    String name;
    float mark;
    String s1,s2;

    InputStreamReader IN = new InputStreamReader(System.in);
    BufferedReader BR = new BufferedReader(IN);
    try {
        System.out.print("Enter your Name: ");
        name=BR.readLine();
        System.out.print("Enter Roll: ");
        s1=BR.readLine();
        roll=Integer.parseInt(s1);
        System.out.print("Enter Mark: ");
        s2=BR.readLine();
        mark=Float.parseFloat(s2);
        System.out.println("Name is: "+name);
        System.out.println("Roll is:"+roll);
        System.out.println("Mark is:"+mark);

    }
    catch(Exception e)
    {
        System.out.println("Exception No:"+e);
    }
    }
}