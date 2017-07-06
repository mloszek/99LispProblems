package excercise.Problem5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Reversing a list
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 3, 3, 0, 0, -12, 233, 233, 233, 6, 8);

        List<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        reversedList.forEach(System.out::println);

    }
}
