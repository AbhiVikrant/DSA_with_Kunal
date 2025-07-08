import java.util.ArrayList;
import java.util.List;
/*

Code
Testcase
Test Result
Test Result
1380. Lucky Numbers in a Matrix
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.



Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.
 */
public class EasyArray23 {
    public static void main(String[] args) {
   int matrix[][] = {{3,7,8},{9,11,13},{15,16,17}};
      System.out.println(luckyNumbers(matrix));
    }
    public static int minimumInRow(int[] matrix)
    {
        int min=Integer.MAX_VALUE, res=0;
        for(int i=0; i<matrix.length; i++)
        {
            if(matrix[i]<min)
            {
                min=matrix[i];
                res=i;
            }
        }
        return res;
    }
    public static int findMaximumInColumn(int[][]matrix, int col)
    {
        int max=Integer.MIN_VALUE,res=0;
        for(int row=0; row<matrix.length; row++)
        {
            if(matrix[row][col]>max)
            {
                max=matrix[row][col];
                res=row;
            }
        }
        return res;
    }
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List myList=new ArrayList();
        //System.out.println(minimumInRow(matrix[1]));
        //System.out.println( findMaximumInColumn(matrix,0));

        for(int i=0; i<matrix.length; i++)
        {
            int colRes=minimumInRow(matrix[i]);
            int minimumInithRow=matrix[i][colRes];
            System.out.println(i+" min "+minimumInithRow+" column where "+colRes);
            //  getting maximum where find minimum in the row
            int maxInColPos=findMaximumInColumn(matrix,colRes);
            System.out.println("hh"+" "+maxInColPos);

            if(i==maxInColPos)
            {
                myList.add(minimumInithRow);
            }


        }
        return myList;
    }
}
