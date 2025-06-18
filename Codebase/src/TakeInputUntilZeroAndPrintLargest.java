import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the largest number from
//all
public class TakeInputUntilZeroAndPrintLargest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int min= Integer.MIN_VALUE;
        while(true)
        {
            System.out.println("Enter a number");
            int a=sc.nextInt();
            if(a!=0 && a>min)
            {
                min=a;
            }
            else
                break;
        }
        System.out.println("integer inputs till the user enters 0 and  the largest number from all is "+min);
    }
}
