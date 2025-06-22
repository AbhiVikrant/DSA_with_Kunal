import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        /*
            [1,2,3,4],
            [1,2,3,4],
            [1,2,3,4]
         */
        int[][] arr2d = new int[4][4];
        System.out.println(arr2d.length);
//        Taking input
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col] = sc.nextInt();
            }
        }
//        Output array
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d.length; col++) {
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }
//      Display using for each row
        for(int[] nums: arr2d)
        {
            System.out.println(Arrays.toString(nums));
        }
    }
}
