public class EasyArray7 {
    public static void main(String[] args) {
          int [] nums={1,2,3,1,1,3};
//          output=4
        System.out.println(numIdenticalPairs2(nums));
    }
static int numIdenticalPairs(int[] nums) {
        int count=0;
        if(nums.length==0)
            return count;
        for(int i=0; i<nums.length; i++)
        {
            int j=i+1;
            while(j<nums.length)
            {
                if(nums[i]==nums[j])
                {
                    count+=1;
                }
                j++;
            }
        }
        return count;
}
//
public static int numIdenticalPairs2(int[] nums) {
    int freq[] = new int[101];
    for(int i=0;i<nums.length;i++){
        freq[nums[i]]++;
    }
    int count=0;
    for(int i=0;i<101;i++){
        if(freq[i] > 1){
            count += freq[i]*(freq[i]-1)/2;
        }
    }
    return count;
}
}
