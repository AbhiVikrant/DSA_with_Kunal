import java.util.ArrayList;
import java.util.List;

//54. Spiral Matrix
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//Hint
//Given an m x n matrix, return all elements of the matrix in spiral order.
//
//
public class Medium_Array_Spiral {
    public static void main(String[] args) {
        int [] []matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        output: [1,2,3,4,8,12,11,10,9,5,6,7]
        System.out.println(spiralOrder(matrix));
    }
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList();
        int m=matrix.length;
        int n=matrix[0].length;
        // defining boundry
        int left=0;
        int top=0;
        int right=n-1;
        int bottom=m-1;
        int counter=1;
        while(counter<=m*n)
        {
            //  transversing from left to right
            for(int i=left; i<=right; i++)
            {
                list.add( matrix[top][i]);
                counter++;
            }
            top++;
            //  tranversing from top to bottom
            for(int i=top; i<=bottom; i++)
            {
                list.add(matrix[i][right]);
                counter++;
            }
            right--;
            //  transversing from right to left and check for rows
            if(top<=bottom)
            {
                for(int i=right; i>=left; i--)
                {
                    list.add(matrix[bottom][i]);
                    counter++;
                }
                bottom--;
            }
            //  tranversing from bottom to top and check for columns
            if(left<=right)
            {
                for(int i=bottom; i>=top; i--)
                {
                    list.add(matrix[i][left]);
                    counter++;
                }
                left++;
            }
        }
        return list;
    }
}
