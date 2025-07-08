/*

Test Result
867. Transpose Matrix
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.





Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
 */
public class EasyArray17 {
    public static void main(String[] args) {
     int [][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
//     Output: [[1,4,7],[2,5,8],[3,6,9]]
    print2dArray(transposeMatrix(matrix));
    }
    static void print2dArray(int[][] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] matrix)
    {
        int[][] result=new int[matrix[0].length][matrix.length];
        for(int col=0; col<matrix[0].length; col++)
        {
            for(int row =0; row<matrix.length; row++)
            {
                result[col][row]=matrix[row][col];
            }
        }
        return result;
    }
}
