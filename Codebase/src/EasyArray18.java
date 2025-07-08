import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EasyArray18 {
    public static void main(String[] args) {
        int nums[]={1,2,3,8,7};
        int k=387;
//         output=       12774
       System.out.println( additionWithCarry(nums,k));
    }
    static List<Integer> additionWithCarry(int[] nums, int k)
    {
        int len=nums.length;
        int cur=k;
        int i=len-1,sum=0;
        List<Integer> myList=new ArrayList();
        while(i>=0 || cur>0)
        {
            int a=nums[i];
             sum+=a+cur%10;
            System.out.println(i+" "+sum);

            myList.add(sum%10);
            sum=sum/10;
            cur=cur/10;
            i--;
        }
        System.out.println(myList);
        Collections.reverse(myList);
        return myList;
    }
}
