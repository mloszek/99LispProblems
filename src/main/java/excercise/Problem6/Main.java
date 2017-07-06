package excercise.Problem6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *Finding out whether a list is a palidrome
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 4, 3, 1);

        boolean check = isPalidrome(list);

        System.out.println("is palidrome: " + check);

    }

    public static boolean isPalidrome (List<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != list.get(list.size() - 1 - i))
                return false;
        }

        return true;

    }
}
