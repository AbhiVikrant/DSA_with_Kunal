import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class GreetMessage {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String str=sc.nextLine();
        System.out.println("Hello "+str);
    }
}
