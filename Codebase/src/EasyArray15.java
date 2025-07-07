/*
1572. Matrix Diagonal Sum

        Easy
Topics
premium lock icon
        Companies
Hint
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.



Example 1:


Input: mat = [[1,2,3],
        [4,5,6],
        [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:

Input: mat = [[1,1,1,1],
        [1,1,1,1],
        [1,1,1,1],
        [1,1,1,1]]
Output: 8
*/
public class EasyArray15 {
    public static void main(String[] args) {
       int[][] mat = {{1,1,1,1},
               {1,1,1,1},
               {1,1,1,1},
               {1,1,1,1}};
       int matt[][]={{1,2,3},{4,5,6},{7,8,9}};
//       System.out.println(sumOfPrimaryDiagonal(matt));
//        System.out.println(sumOfSecondaryDiagonal(matt));
        System.out.println(diagonalSum(mat));
        System.out.println(diagonalSum(matt));



    }
    public static int sumOfPrimaryDiagonal(int[][] mat)
    {
        int sum=0;
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat.length; j++)
            {
                if(i==j)
                {
                   sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
    public static int sumOfSecondaryDiagonal(int[][]mat)
    {
        int sum=0, length=mat.length;
        for(int i=0; i<length; i++)
        {

            sum+=mat[i][length-i-1];

        }
        return sum;
    }
    public static int diagonalSum(int[][] mat) {
       int sum=0;
        if(mat.length%2==0)
       {
          sum+=sumOfPrimaryDiagonal(mat)+sumOfSecondaryDiagonal(mat);
       }
        else
        {
            sum+=sumOfSecondaryDiagonal(mat)+sumOfPrimaryDiagonal(mat)-mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}

//public int diagonalSum(int[][] mat) {
//        int size=mat.length;
//        int i=0;
//        int j=0;
//
//        int psum=0;
//        int ssum=0;
//
//        while(i<size && j<size){
//            psum+=mat[i][j];
//            i++;
//            j++;
//        }
//
//        i=0;
//        j=size-1;
//
//        while(i<size && j>=0){
//            ssum+=mat[i][j];
//            i++;
//            j--;
//        }
//
//        if(size%2==0){
//            return psum+ssum;
//        }
//        else{
//            return psum+ssum-mat[size/2][size/2];
//        }
//    }
