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

        List<Integer> sublist = new ArrayList<>();

        int temp = 0;

        for (int i = 0; i < list.size(); i++) {
            if (i == 0){
                temp = list.get(i);
                sublist.add(list.get(i));
            }else if (list.get(i) != temp){
                listBundle.add(sublist);
                temp = list.get(i);
                sublist = new ArrayList<>();
                sublist.add(list.get(i));
            }else if ((list.get(i) == temp)){
                sublist.add(list.get(i));
            }
        }
        listBundle.add(sublist);

        listBundle.forEach(System.out::println);

    }
}
