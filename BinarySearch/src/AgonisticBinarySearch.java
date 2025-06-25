import java.util.Arrays;
import java.util.Scanner;

// This is the binary search where we don't know whether array is either ascending sorted or descending sorted
public class AgonisticBinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count of number you want to store ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter target element to search");
        int target=sc.nextInt();
        System.out.println("Enter the numbers either in ascending or descending order");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array : "+ Arrays.toString(arr) + "target element "+target);
        int ans=agonisticBinarySearch(arr,target);
        System.out.println("Element found at "+ans+" index");

    }
    static int agonisticBinarySearch(int arr[], int target)
    {
        int start=0,end=arr.length-1,mid;
        boolean isAscending=arr[start]<=arr[end];
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(isAscending)
            {
               if(target>arr[mid])
                   start=mid+1;
               else
                   end=mid-1;
            }
            else {
                if(target>arr[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return -1;
    }
}
