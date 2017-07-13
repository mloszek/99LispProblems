package excercise.Problem16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Dropping every N'th element of a list
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");

        List<String> result = new ArrayList<>();

        int counter = 0;

        for (int i = 0; i < list.size(); i++) {
            if (counter < 2) {
                result.add(list.get(i));
                counter++;
            }else
                counter = 0;
        }

        result.forEach(System.out::println);

    }
}
