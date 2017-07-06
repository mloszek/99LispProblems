package excercise.Problem8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Eliminating consecutive duplicates of list
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 5, 3, 7, 7, 3, 3, 3, 3, 8, 6, 6);

        List<Integer> singledList = new ArrayList<>();

        int temp = 0;

        for (int i = 0; i < list.size(); i++) {
           if (i == 0){
              temp = list.get(i);
              singledList.add(list.get(i));
           }else if (!(list.get(i) == temp)){
               temp = list.get(i);
               singledList.add(list.get(i));
           }
        }

        singledList.forEach(System.out::println);

    }
}