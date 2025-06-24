// Program to demonstrate linear search
public class Main {
    public static void main(String[] args) {

        int arr[]={1,2,4,4,5,5,6,-8,-90};
        int target=4,target2=-1;
        System.out.println("Index at  "+target+" is "+linearSearchReturnIndex(arr,target));
        System.out.println(linearSearchReturnBoolean(arr,target2));
        }
//         Function for linear search returning target index first occurance

        static int linearSearchReturnIndex(int [] arr, int target)
        {
//             Checking if arr length ==0 or empty array then return -1
            if(arr.length==0)
                return -1;
//             Iterate through element of array till length-1
            for(int index=0; index<arr.length; index++)
            {
//               array element
                int element=arr[index];
//                Doing comparision
                if(element==target)
                    return index;
            }
//             if not found target then returning -1
            return -1;
        }
    static boolean linearSearchReturnBoolean(int [] arr, int target)
    {
//             Checking if arr length ==0 or empty array then return -1
        if(arr.length==0)
            return false;
//             Iterate through element of array till length-1
        for(int index=0; index<arr.length; index++)
        {
//               array element
            int element=arr[index];
//                Doing comparison
            if(element==target)
                return true;
        }
//             if not found target then returning -1
        return false;
    }
    }
