package excercise.Problem21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Inserting an element at a given position into a list
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h"));

        String insert = "shit";
        int index = 4;

        list.add(index, insert);

        list.forEach(System.out::println);

    }
}
