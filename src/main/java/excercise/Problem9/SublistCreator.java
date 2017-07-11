package excercise.Problem9;

import java.util.ArrayList;
import java.util.List;

/**
 *Creating sublists for duplicated elements
 */
public class SublistCreator {

    List<Integer> sublist;

    public SublistCreator(List<Integer> sublist) {
        this.sublist = sublist;
    }

    public void addToSublist(Integer integer){

        sublist.add(integer);

    }


}
