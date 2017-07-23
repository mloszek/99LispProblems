package excercise.Problem23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Extract a given number of randomly selected elements from a list
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h"));

        int givenNumber = 3;

        Random random = new Random();

        for (int i = 0; i < givenNumber; i++) {
            list.remove(random.nextInt(list.size() - i));
        }

        list.forEach(System.out::print);
    }
}
