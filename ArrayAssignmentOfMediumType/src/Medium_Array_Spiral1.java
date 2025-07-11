import java.util.Arrays;

//Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
//
//
//
//Example 1:
//
//
//Input: n = 3
//Output: [[1,2,3],[8,9,4],[7,6,5]]
public class Medium_Array_Spiral1 {
    public static void main(String[] args) {
        int n=3;
        int[][] res=generateMatrix(n);
        for(int [] i: res)
        {
            System.out.println(Arrays.toString(i));
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] spiral=new int[n][n];
        int counter=1;
        // boundry
        int top=0,bottom=n-1,right=n-1,left=0;
        while(counter<=n*n)
        {
            //  filling from left to right
            for(int i=left; i<=right; i++)
            {
                spiral[top][i]=counter;
                counter++;
            }
            top++;
            // filling from top to bottom
            for(int i=top; i<=bottom; i++)
            {
                spiral[i][right]=counter;
                counter++;
            }
            right--;
            //  filling from right to left and check for rows
            if(top<=bottom)
            {
                for(int i=right; i>=left; i--)
                {
                    spiral[bottom][i]=counter;
                    counter++;
                }
                bottom--;
            }
            // filling from bottom to top and check for cols
            if(left<=right)
            {
                for(int i=bottom; i>=top; i--)
                {
                    spiral[i][left]=counter;
                    counter++;
                }
                left++;
            }
        }
        return spiral;
    }
}
