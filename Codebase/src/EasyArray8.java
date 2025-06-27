import java.util.Arrays;

public class EasyArray8 {
    public static void main(String[] args) {
       int[] nums={8,1,2,2,3};
       System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int []count= new int[101];
        int[]answer= new int[nums.length];
        for (int num : nums) {
            System.out.println(count[num]);
            count[num]=count[num]+1;
        }
        System.out.println(Arrays.toString(count));
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num==0){
                answer[i]=0;
            }
            else{
                int counter=0;
                for (int j = num-1; j >=0 ; j--) {
                    counter+=count[j];
                }
                answer[i]=counter;
            }
        }


        return answer;
    }
}
