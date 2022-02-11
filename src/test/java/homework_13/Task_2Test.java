package homework_13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Task_2Test {
    private Task_2 task2;
    private static List<String> list = Arrays.asList("one", "two", "three");

    @BeforeEach
    public void setUp() {
        task2 = new Task_2(list);
    }

    @Test
    void createNewListOfPair_True() {

        Map<String, String> stringMap1 = task2.createNewListOfPair();
        Map<String, String> stringMap = getStringMap();

        assertEquals(stringMap, stringMap1);
    }

    @Test
    void createNewListOfPair_False() {

        Map<String, String> stringMap1 = task2.createNewListOfPair();
        Map<String, String> stringMap = getStringMap();
        stringMap.put("three", "three");


        assertNotEquals(stringMap, stringMap1);
    }

    private Map<String, String> getStringMap() {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("one", "ONE");
        stringMap.put("two", "TWO");
        stringMap.put("three", "THREE");
        return stringMap;
    }
}