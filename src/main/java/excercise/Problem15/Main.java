package excercise.Problem15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Multiplying elements given number of times
 */
public class Main {
    public static void main(String[] args){

        List<String> list = Arrays.asList("a", "b", "c");

        List<String> multiList = new ArrayList<>();

        int MULTIPLICATOR = 4;

        for (String s: list) {
            for (int i = 0; i < MULTIPLICATOR; i++) {
                multiList.add(s);
            }
        }

        multiList.forEach(System.out::println);

    }
}
