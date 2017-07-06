package excercise.Problem7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Flattening nested list
 */
public class Main {
    public static void main(String [] args){

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 3, 5), Arrays.asList(2, 4, 6), Arrays.asList(6, 8, 4));

        List<Integer> flattenList = list.stream()
                .flatMap(List -> List.stream())
                .collect(Collectors.toList());

        flattenList.stream().forEach(System.out::println);

    }
}
