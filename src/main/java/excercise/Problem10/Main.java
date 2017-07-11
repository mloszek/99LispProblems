package excercise.Problem10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Encoding results of Problem 9
 */
public class Main {
    public static void main(String[] args){

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1), Arrays.asList(2, 2), Arrays.asList(3), Arrays.asList(7, 7), Arrays.asList(3, 3, 3, 3), Arrays.asList(8), Arrays.asList(6, 6));

        List<IntegersEncoder> encodedList = new ArrayList<>();

        for (List<Integer> numbers: list) {
            encodedList.add(new IntegersEncoder(numbers.size(), numbers.get(0).toString()));
        }

        encodedList.forEach(element -> System.out.println(element.toString()));

    }
}
