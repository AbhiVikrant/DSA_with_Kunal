import java.util.Scanner;

public class SumTill0 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true)
        {
          System.out.println("Enter a number if want to exit enter 0");
          int a =sc.nextInt();
          if(a!=0)
              sum+=a;
          else
          {
              break;
          }
        }
        System.out.println(sum);
    }
}
