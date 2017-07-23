package excercise.Problem24;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Lotto: Drawing N different random numbers from the set 1..M
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> list = listMake(1, 10);

        int amountOfNumbers = 4;

        Random random = new Random();

        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.print(list.get(random.nextInt(list.size() - i)) + " ");
        }


    }

    public static List<Integer> listMake(int min, int max) {

        List<Integer> list = new ArrayList<>();

        if (min < max) {
            for (int i = min; i <= max; i++) {
                list.add(i);
            }
        }

        return list;
    }
}
