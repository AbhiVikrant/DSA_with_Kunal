//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

public class SumTillX {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
       while(true)
       {
           System.out.println("Enter a number and to quit taking input enter X");
           String input=sc.nextLine();
           if(!input.equalsIgnoreCase("X"))
           {
               sum+=Integer.parseInt(input);
           }
           else
               break;
       }
       System.out.println(sum);
    }
}
