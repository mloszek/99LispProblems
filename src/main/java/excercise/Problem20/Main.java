package excercise.Problem20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Removing the K'th element from a list
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        List<String> rfcList = new ArrayList<>();

        int K = 3;

        for (int i = 0; i < list.size(); i++) {
            if (i != K) {
                rfcList.add(list.get(i));
            }
        }

        rfcList.forEach(System.out::println);

    }
}
