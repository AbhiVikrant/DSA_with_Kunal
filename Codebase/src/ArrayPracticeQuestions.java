import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeQuestions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
       System.out.println("Original array "+ Arrays.toString(arr));
       swap(arr,3,4);
       System.out.println("Swapped array with 3 and 4th index "+ Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed array " + Arrays.toString(arr));
       System.out.println("Maximum in array is "+maximumInArray(arr));
       System.out.println("Maximum in range in Array is "+maxInArrayInRange(arr,1,3));
        System.out.println("Original array "+ Arrays.toString(arr));

    }

    static void swap(int arr[], int index1, int index2) {
        try {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void reverseArray(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static int maximumInArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static int maxInArrayInRange(int[] arr, int start, int end) {
        if (start > end) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
        if (arr[i] > maxVal) {
            maxVal = arr[i];
        }

    }
        return maxVal;
    }

}
