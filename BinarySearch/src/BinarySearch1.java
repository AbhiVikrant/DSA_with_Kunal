public class BinarySearch1 {
    public static void main(String[] args) {
        int arr[]={23,44,67,88,90,103,111,670};
        int target=670;
        System.out.println(binarySearch1(arr,target));
    }
//     Assuming array is sorted in ascending way
    static int binarySearch1(int[] arr, int target)
    {
//
        int start=0,end=arr.length-1;
        int mid;
        while(start<=end)
        {
//            finding the mid-element
            mid=start+((end-start)/2);
//            comparing mid first
            if(arr[mid]==target)
                return mid;
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
