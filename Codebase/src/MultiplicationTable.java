import java.util.Scanner;

//Take a number as input and print the multiplication table for it
public class MultiplicationTable {
    static void printTable(int n)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(i+" "+"*"+" "+n+"="+" "+i*n);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printTable(n);
    }
}
