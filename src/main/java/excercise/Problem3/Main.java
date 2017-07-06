package excercise.Problem3;

import java.util.Arrays;
import java.util.List;

/**
 *Finding K'th element of a list
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 3, 3, 0, 0, -12, 233, 233, 233, 6, 8);

        findKthElement(list, 7);

    }

    public static void findKthElement(List<Integer> list, int elementIndex) {

        Integer result = null;

        try {

            result = list.get(elementIndex);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("no such element");
            System.exit(0);

        }

        System.out.println(result);
    }
}
