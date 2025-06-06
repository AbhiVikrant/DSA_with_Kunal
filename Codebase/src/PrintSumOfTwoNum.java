import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class PrintSumOfTwoNum {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number: ");
        int n1= Integer.parseInt(br.readLine());
        System.out.println("Enter second number: ");
        int n2=Integer.parseInt(br.readLine());
        System.out.println("Sum of two num is " +(n1+n2));
    }
}
