package homework_13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task_3Test {
    private Task_3 task3;
    private static List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "Nine");


    @BeforeEach
    public void setUp() {
        task3 = new Task_3(list);
    }

    @Test
    void sortAndPrintOfCreatedList_True() {
        List<String> listResult = Arrays.asList("four", "five");
        List<String> listTest = task3.sortAndPrintOfCreatedList();
        assertEquals(listResult, listTest);
    }
    @Test
    void sortAndPrintOfCreatedList_False() {
        List<String> listResult = Arrays.asList("four", "five", "Nine" );
        List<String> listTest = task3.sortAndPrintOfCreatedList();
        assertNotEquals(listResult, listTest);
    }
}