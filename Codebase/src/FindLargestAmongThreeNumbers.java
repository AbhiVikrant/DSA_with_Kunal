import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class FindLargestAmongThreeNumbers {
    static int findLargestAmongThree(int a, int b, int c)
    {
        int max=a;
        if(max<b)
            max=b;
        if(max<c)
            max=c;
        return max;
    }
    static int findSmallestAmongThree(int a, int b, int c)
    {
        int min=a;
        if(min>b)
            min=b;
        if(min>c)
            min=c;
        return min;
    }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter three numbers");
       int first=sc.nextInt(),second=sc.nextInt(),third=sc.nextInt();
       System.out.println("Largest among "+first+","+second+","+third+" is "+findLargestAmongThree(first,second,third));
       System.out.println("Smallest among "+first+","+second+","+third+" is "+findSmallestAmongThree(first,second,third));

   }
}
