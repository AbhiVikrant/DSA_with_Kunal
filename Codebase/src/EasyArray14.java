//1252. Cells with Odd Values in a Matrix
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
//
//For each location indices[i], do both of the following:
//
//Increment all the cells on row ri.
//Increment all the cells on column ci.
//Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
//
//
//
//Example 1:
//
//
//Input: m = 2, n = 3, indices = [[0,1],[1,1]]
//Output: 6
//Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//After applying first increment it becomes [[1,2,1],[0,1,0]].
//The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
//Example 2:
//
//
//Input: m = 2, n = 2, indices = [[1,1],[0,0]]
//Output: 0
//Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.
//

public class EasyArray14 {
    public static void main(String[] args) {
//        int m = 28, n = 38, indices[][] = {{0,1},{1,1}};
        int m=28, n=38, indices[][]={{17,16},{26,31},{19,12},{22,24},{17,28},{23,21},{27,32},{23,27},{23,33},{18,7},{4,20},{0,31},{25,33},{5,22}};
        int a=oddCells(m,n,indices);
        //print2dArray(indices);
        System.out.println(a);
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

    public static int oddCells(int m, int n, int[][] indices) {
          int[][] arr= new int[m][n];
              print2dArray(arr);
              for(int i=0; i< indices.length; i++)
              {
                  int ri=indices[i][0];
                  System.out.println(ri);
                  int ci=indices[i][1];
                  System.out.println(ci);
//                  for row increment
                  for(int a=0; a<n; a++ )
                  {
                      arr[ri][a]+=1;
                  }
                  // for column increment
                  for(int b=0; b<m; b++)
                  {
                      arr[b][ci]+=1;
                  }
                  print2dArray(arr);
              }
              int count=0;
              for(int row=0; row<arr.length; row++)
              {
                  for(int col=0; col<arr[row].length; col++)
                  {
                      if(arr[row][col]%2!=0)
                          count+=1;
                  }
              }
          return count;
    }
}
