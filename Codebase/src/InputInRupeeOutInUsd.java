import java.util.Scanner;

//6. Input currency in rupees and output in USD.
public class InputInRupeeOutInUsd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rupee in Indian");
        double inr=sc.nextDouble();
        double usd=inr/78.5;
        System.out.println("The given rupees"+inr+" in USD as $"+usd);
    }
}
