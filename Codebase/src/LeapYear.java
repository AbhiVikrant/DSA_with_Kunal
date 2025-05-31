/*<h1> Input a year and find whether it is a leap year or not.</h1>
<h2>PseudoCode</h2>
        1. Take input from user
2. write a function which check whether it is a leap year or not basic on this return true or false
conditions:
A year is a leap year if "any one of " the following conditions are satisfied: <br>
1. The year is multiple of 400.
        2. The year is a multiple of 4 and not a multiple of 100.
        3. Print Leap Year if true else not a leap year

 */
import java.util.Scanner;

public class LeapYear {
    static boolean checkYear(int n)
    {
        if(n%4==0 && n>0)
        {
            if(n%100==0)
            {
                return n%400==0;
            }
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year: ");
        int year=sc.nextInt();
        boolean res=checkYear(year);
        if(res)
            System.out.println("It's a leap year");
        else
            System.out.println("It's not a leap year");

    }
}
