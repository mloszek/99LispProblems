package excercise.Problem9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Packing consecutive duplicates of list elements into sublists
 */
public class Main {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1, 2, 2, 5, 3, 7, 7, 3, 3, 3, 3, 8, 6, 6);

        List<List<Integer>> listBundle = new ArrayList<>();

        List<Integer> sublist;

        int temp = 0;

        for (int i = 0; i < list.size(); i++) {
            if (i == 0){
                temp = list.get(i);
                sublist = new ArrayList<>();
                sublist.add(list.get(i));
                listBundle.add(sublist);
            }else if (!(list.get(i) == temp)){
                temp = list.get(i);

            }
        }

        listBundle.forEach(System.out::println);

    }
}
