import java.util.Arrays;
import java.util.Scanner;

public class GenerateSpiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
//        spiral
        int[][]result=generateSpiralSquareMatrix(n);
        for(int i=0; i<n; i++)
        {
            System.out.println(Arrays.toString(result[i]));
        }
    }
    static int[][] generateSpiralSquareMatrix(int n)
    {
        int[][] spiral=new int[n][n];
        int counter=1;
//         defining boundries for moving
//         top
        int top=0;
//       right
        int right=n-1;
//      bottom
        int bottom=n-1;
//      left
        int left=0;
//        filling matrix from left to right
       while(counter<=n*n)
       {
           for(int i=left; i<=right; i++)
           {
               spiral[top][i]=counter;
               counter++;
           }
           top++;
//       filling from top to bottom
           for(int i=top; i<=bottom; i++)
           {
               spiral[i][right]=counter;
               counter++;
           }
           right--;
//         filling from right to left
           if(top<=bottom)
           {
               for(int i=right; i>=left; i--)
               {
                   spiral[bottom][i]=counter;
                   counter++;
               }
               bottom--;
           }
//         filling from bottom to top
//         ensure if columns left
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
