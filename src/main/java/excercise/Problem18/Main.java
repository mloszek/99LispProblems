package excercise.Problem18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Extract a slice from a list
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");

        System.out.println(listSlice(3, 7, list));

    }

    public static List<String> listSlice(int from, int to, List<String> list) {

        List<String> temp = new ArrayList<>();

        for (int i = from - 1; i <= to - 1; i++) {
            temp.add(list.get(i));
        }

        return temp;

    }
}