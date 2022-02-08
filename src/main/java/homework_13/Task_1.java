package homework_13;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        Stream<Integer> integerStream = numbers.stream();
        
    }
}
