import java.util.Arrays;
import java.util.Scanner;

/*

1304. Find N Unique Integers Sum up to Zero
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an integer n, return any array containing n unique integers such that they add up to 0.



Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
 */
public class EasyArray22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {

        int res[]=new int[n];
        if(n==1)
        {
            res[0]=0;
            return res;
        }

        for(int i=1; i<n; i++)
        {
            res[i]=i;
        }
        res[0]=-((n-1)*(n))/2;
        return res;
    }
}
