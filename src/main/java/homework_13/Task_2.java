package homework_13;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task_2 {
    private List<String> list;

    public Task_2(List<String> list) {
        this.list =list;
    }

    public Map<String, String> createNewListOfPair() {
        return list.stream()
                .collect(Collectors.toMap(Function.identity(), String::toUpperCase));
    }
}
