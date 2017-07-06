package excercise.Problem2;

import java.util.Arrays;
import java.util.List;

/**
 * Finding last but one box of a list
 */
public class Main {
    public static void main(String [] args) {

        List<Integer> list = Arrays.asList(1, 3, 3, 3, 0, 0, -12, 233, 233, 233, 6, 8);

        findLastButOne(list);

    }

    public static void findLastButOne(List<Integer> list){

        System.out.println(list.get(list.size() - 2));

    }
}
