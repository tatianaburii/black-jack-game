package homework_12;

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MyArrayListRun {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 1; i < 5; i++) {
            myArrayList.add("n_" + i);
        }
        System.out.println(myArrayList.delete("n_2"));

    }
}
