package excercise.Problem12;

import excercise.Problem10.IntegersEncoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Decoding a run-length encoded list
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
        }//Problem 11 code

        List<Integer> decList = new ArrayList<>();

        for (Object object : modList) {
            if (!(object instanceof IntegersEncoder)){
                decList.add(Integer.parseInt(object.toString()));
            }else {
                for (int i = 0; i < ((IntegersEncoder) object).getAmount(); i++) {
                    decList.add(Integer.parseInt(((IntegersEncoder) object).getCharacter()));
                }
            }
        }

        decList.forEach(System.out::println);

    }
}
