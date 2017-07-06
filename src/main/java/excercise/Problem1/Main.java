package excercise.Problem1;

import java.util.Arrays;
import java.util.List;

/**
 * Finding last box of a list
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 3, 3, 0, 0, -12, 233, 233, 233, 6, 8);

        findLast(list);

    }

    public static void findLast(List<Integer> list){

        System.out.println(list.get(list.size() - 1));

    }
}
