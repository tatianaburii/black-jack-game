package homework_13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task_1Test {
    private Task_1 task1;
    private List<Integer> numbers = Arrays.asList(1,4,4);


    @BeforeEach
    public void setUp() {
        task1 = new Task_1(numbers);
    }

    @Test
    public void calculateAverage_True() {
        double d = task1.calculateAverage();
        assertEquals(3, d);
    }
    @Test
    public void calculateAverage_False(){
        double d = task1.calculateAverage();
        assertNotEquals(2, d);
    }
}