package excercise.Problem25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Generating a random permutation of the elements of a list
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));

        List<String> permutated = new ArrayList<>();

        Random random = new Random();
        int length = list.size();

        for (int i = 0; i < length; i++) {
            String temp = list.get(random.nextInt(list.size()));
            permutated.add(temp);
            list.remove(temp);
        }

        permutated.forEach(System.out::println);

    }
}