import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new  ArrayList<ArrayList<Integer> >();
//     creating row of list
        for(int i=0; i<3; i++)
        {
            list.add(new ArrayList<Integer>());
        }
        System.out.println(list);
        list.get(0).add(0,3);
        list.getFirst().add(1,22);
        list.get(1).add(0,112);
        list.get(2).add(0,133);
        list.add(new ArrayList<Integer>(
                Arrays.asList(83, 6684, 776)));

        System.out.println(list);



    }
}
