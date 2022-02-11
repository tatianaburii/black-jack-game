package homework_13;


import java.util.List;

public class Task_1 {
    private List<Integer> numbers;

    public Task_1(List<Integer> numbers){
        this.numbers = numbers;

    }
    public double calculateAverage() {
        return numbers.stream().mapToInt(e -> e).average().getAsDouble();
    }

}
