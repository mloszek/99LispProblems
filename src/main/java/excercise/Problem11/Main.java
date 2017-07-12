package excercise.Problem11;

import excercise.Problem10.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Modified run-length encoding
 */
public class Main {
    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1), Arrays.asList(2, 2), Arrays.asList(3), Arrays.asList(7, 7), Arrays.asList(3, 3, 3, 3), Arrays.asList(8), Arrays.asList(6, 6));

        List<excercise.Problem10.IntegersEncoder> encodedList = new ArrayList<>();

        for (List<Integer> numbers : list) {
            encodedList.add(new excercise.Problem10.IntegersEncoder(numbers.size(), numbers.get(0).toString()));
        }//Problem 10 code

        List<Object> modList = new ArrayList<>();

        for (IntegersEncoder integersEncoder : encodedList) {
            if (integersEncoder.getAmount() == 1) {
                modList.add(integersEncoder.getCharacter());
            } else
                modList.add(integersEncoder);
        }

        modList.forEach(element -> System.out.println(element.toString()));

    }
}
