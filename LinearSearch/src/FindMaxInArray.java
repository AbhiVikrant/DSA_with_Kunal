public class FindMaxInArray {
    public static void main(String[] args) {
        int []arr={22,3,55,90,7,-10};
        System.out.println(findMax(arr));
        System.out.println("Minimum in array is "+findMin(arr));
    }
    static int findMax(int [] arr)
    {
        if(arr.length==0)
            return 0;
        int max=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
    static int findMin(int [] arr)
    {
        if(arr.length==0)
            return 0;
        int min=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(min>arr[i])
                min=arr[i];
        }
        return min;
    }
}
