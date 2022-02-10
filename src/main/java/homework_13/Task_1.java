package homework_13;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = createList();

        System.out.println(numbers.stream()
                .mapToInt((s) -> Integer.parseInt(String.valueOf(s)))
                .average());
    }


    public static ArrayList<Integer> createList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        return numbers;
    }
}
