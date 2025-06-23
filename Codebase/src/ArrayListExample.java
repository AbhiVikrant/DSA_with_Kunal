import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
//        Declaration
//        ArrayList list=new ArrayList(); // but it's a bad practice
        ArrayList<Integer> list=new ArrayList<>(5);
        System.out.println(list.isEmpty());// true
        System.out.println(list.size()); //0
        for(int i=0; i<5; i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(list); // 1 2 3 4 5
        System.out.println(list.size()); //5
        System.out.println(list.get(0)); // 1
        System.out.println(list.isEmpty());// false
        list.remove(4); // remove 4th index i.e. 5
        System.out.println(list); // 1 2 3 4
        list.removeAll(list);
        System.out.println(list);
        // adding
        list.add(0,23);
        list.add(5);
        list.add(12);
        list.add(1);
        list.add(1);
        list.add(13);
        list.add(23);
        list.add(1);
//        checking index of
        System.out.println(list.indexOf(1));
//         checking lastIndexOf
        System.out.println(list.lastIndexOf(1));
//        contains
        System.out.println(list.contains(0));
//
        int[] arr={23, 5, 12, 1, 1, 13, 23, 1};
//        equals
        System.out.println(list.equals(arr));
        ArrayList<Integer> l = new ArrayList<>();

        l.add(1);
        l.add(2);

        // Initializing another list
        ArrayList<Integer> l2 = new ArrayList<>();

        l2.add(1);
        l2.add(2);

        if (l.equals(l2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
         System.out.println(list.hashCode());
         list.clear();
        System.out.println(list);

    }
}
