package excercise.Problem14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Duplicating elements
 */
public class Main {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(2, 3, 4, 4, 5, 7, 7, 7, 9);

        List<Integer> dupList = new ArrayList<>();

        for (Integer integer: list) {
            for (int i = 0; i < 2; i++) {
                dupList.add(integer);
            }
        }

        dupList.forEach(System.out::println);

    }
}
