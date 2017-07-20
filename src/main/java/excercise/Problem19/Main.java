package excercise.Problem19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Swapping a list N places to the left..
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");

        List<String> split1 = new ArrayList<>();

        List<String> split2 = new ArrayList<>();

        int pivot = 2;

        if (pivot > list.size() || pivot < -list.size()){
            System.exit(0);
        }

        if (pivot > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (i < pivot) {
                    split2.add(list.get(i));
                } else
                    split1.add(list.get(i));
            }
        }else {
            for (int i = 0; i < list.size(); i++) {
                if (i < list.size() + pivot) {
                    split2.add(list.get(i));
                } else
                    split1.add(list.get(i));
            }
        }

        System.out.println("split1: ");
        split1.forEach(System.out::println);
        System.out.println("split2: ");
        split2.forEach(System.out::println);

    }
}
