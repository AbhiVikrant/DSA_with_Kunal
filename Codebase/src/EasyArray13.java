public class EasyArray13 {
    public static void main(String[] args) {
//       int [][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] image= {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
       int[][] result=flipAndInvertImage(image);
       for(int i=0; i<result.length; i++)
       {
           for(int j=0; j<result[i].length; j++)
           {
               System.out.print(result[i][j]+",");
           }
           System.out.println();
       }
    }
    static int[][] flipImage(int[][] image)
    {
        // row
        for(int row=0; row<image.length; row++)
        {
//             value to store last and start index for each cols
            int last=image[row].length-1, start=0;
             while(start<last) {
                 int temp = image[row][start];
                 image[row][start] = image[row][last];
                 image[row][last] = temp;
                 last--;
                 start++;
             }
        }
        return image;
    }
    static int[][] invertImage(int[][] image)
    {
        for(int row=0; row<image.length; row++)
        {
            for(int col=0; col<image[row].length; col++)
            {
                if(image[row][col]==1)
                    image[row][col]=0;
                else
                    image[row][col]=1;
            }
        }
        return image;
    }
    public static int[][] flipAndInvertImage(int[][] image) {
          return invertImage(flipImage(image));
    }
}
