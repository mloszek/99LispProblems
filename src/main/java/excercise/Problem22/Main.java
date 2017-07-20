package excercise.Problem22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Creating a list containing all integers within a given range
 */
public class Main {
    public static void main(String[] args) {

        listMake(4, 9).forEach(System.out::println);

    }

    public static List<Integer> listMake(int min, int max) {

        List<Integer> list = new ArrayList<>();

        if (min < max) {
            for (int i = min; i <= max; i++) {
                list.add(i);
            }
        }

        return list;
    }
}
