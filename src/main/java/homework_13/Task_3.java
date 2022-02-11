package homework_13;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Task_3 {
    private List<String> list;

    public Task_3(List<String> list) {
        this.list = list;
    }

    public List<String> sortAndPrintOfCreatedList() { //зробила так щоб тестити
        List<String> newList = list.stream()
                .filter(a -> a.length() == 4)
                .filter(a -> a.equals(a.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
        newList.stream().forEach(System.out::println);
        return newList;

    }
}
