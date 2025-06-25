import java.util.Arrays;

//1470. Shuffle the Array
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//
//
//
//Example 1:
//
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7]
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
public class EasyArray5 {
    public static void main(String[] args) {
        int n=3;
        int[] arr={2,5,1,3,4,7};
//        [2,3,5,4,1,7]
        System.out.println(Arrays.toString(shuffledArray(arr,n)));

    }
    static int[] shuffledArray(int[] nums, int n)
    {
        int[]ans=new int[2*n];
        int increment=0,i=0;
        while(i<n)
        {
            ans[increment]=nums[i];
            ans[increment+1]=nums[i+n];
            i++;
            increment+=2;
        }
        return ans;
    }
}
