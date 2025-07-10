import java.util.Arrays;
import java.util.Scanner;

public class EasyArray25 {
    public static void main(String[] args) {
         int mat[][]={{1,3,4,5},{7,8,9,7},{11,5,6,5}};
         int matt[][]={{1,2,3},{3,4,5}};
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(), c=sc.nextInt();
        int[][] res=reshapeMat(matt,r,c);
        for(int i=0; i<res.length; i++)
        {
            System.out.println(Arrays.toString(res[i]));
        }

    }
    static int[][] reshapeMat(int [] []mat, int r, int c)
    {
        int m=mat.length,n=mat[0].length;
        if(m*n!=r*c)
            return mat;
        int col=0,row=0;
        int[][]resultMat=new int[r][c];
//        filling row wise
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                resultMat[row][col]=mat[i][j];
                col++;
                if(col==c)
                {
                    col=0;
                    row++;
                }
            }
        }
        return resultMat;
    }
}
