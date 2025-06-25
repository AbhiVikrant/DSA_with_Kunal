public class BinarySearch2 {
    public static void main(String[] args) {
      int arr[]={900,800,45,33,11,5,4,4,-4};
      int target=11;
      System.out.println(binarySearch2(arr,target));
    }
//   For descending order sorted array
    static int binarySearch2(int[] arr, int target)
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
            else if(target<arr[mid])
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
