import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer
public class Leetcode1 {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0,product=1;
        while(a>0)
        {
            int digit=a%10;
            sum+=digit;
            product*=digit;
            a=a/10;
        }
            System.out.println(product-sum);
    }
}
