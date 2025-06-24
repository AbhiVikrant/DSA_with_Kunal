import java.util.Arrays;

public class LinearSearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr={
                {22,3,6,7},
                {12,5,777,88,8},
                {3,5,9,0,-9},
                {1,22}
        };
        int target=-900;
       int[] ans=search(arr,target);
       System.out.println(Arrays.toString(ans));
    }
//     return row and columns where element found
    static int[] search(int[][] arr, int target)
    {
        if(arr.length==0)
            return new int[0];
        for(int row=0; row<arr.length; row++)
        {
            for(int col=0; col<arr[row].length; col++)
            {
                if(arr[row][col]==target)
                    return new int[]{row,col};
            }
        }
        return new int[]{};
    }
}
