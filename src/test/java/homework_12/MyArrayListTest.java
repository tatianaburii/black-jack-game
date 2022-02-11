package homework_12;

import org.junit.Test;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class MyArrayListTest {
    private MyArrayList myArrayList;

    @Before
    public void setUp() {

        myArrayList = new MyArrayList();
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");
    }

    @Test
    public void AddElements_true() {

        myArrayList.add("four");

        assertEquals("four", myArrayList.get(3));
        assertEquals(4, myArrayList.size());
    }

    @Test
    public void AddElementsOfIndex_true() {

        myArrayList.add(1, "point");

        assertEquals("one", myArrayList.get(0));
        assertEquals("point", myArrayList.get(1));
        assertEquals("two", myArrayList.get(2));
    }

    @Test
    public void AddElementsOfIndex_testArrayIndexOutOfBoundsException() {

        ArrayIndexOutOfBoundsException thrown = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            myArrayList.add(6, "point");
        }, "ArrayIndexOutOfBoundsException was expected");
        Assertions.assertEquals("the index is incorrect", thrown.getMessage());
    }

    @Test
    public void isDelete_indexInBounds_true() {

        assertTrue(myArrayList.delete(1));
        assertEquals("three", myArrayList.get(1));
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void isDelete_testArrayIndexOutOfBoundsException() {

        ArrayIndexOutOfBoundsException thrown = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            myArrayList.delete(-1);
        }, "ArrayIndexOutOfBoundsException was expected");
        Assertions.assertEquals("the index is incorrect", thrown.getMessage());

    }

    @Test
    public void isDelete_Object_true() {

        assertTrue(myArrayList.delete("two"));
        assertEquals("three", myArrayList.get(1));
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void isDelete_Object_false() {

        assertFalse(myArrayList.delete("five"));
        assertEquals(3, myArrayList.size());
    }

    @Test
    public void testClear() {

        myArrayList.clear();
        assertEquals(0, myArrayList.size());
    }

    @Test
    public void isContain_true() {

        assertTrue(myArrayList.contain("one"));
    }

    @Test
    public void isContain_false() {

        assertFalse(myArrayList.contain("five"));
    }

    @Test
    public void testEquals_true() {

        MyArrayList myArrayList1 = myArrayList;

        MyArrayList myArrayList2 = new MyArrayList();
        myArrayList2.add("one");
        myArrayList2.add("two");
        myArrayList2.add("three");

        assertTrue(myArrayList.equals(myArrayList1));
        assertTrue(myArrayList.equals(myArrayList2));
    }

    @Test
    public void testEquals_false() {

        MyArrayList myArrayList2 = new MyArrayList();

        myArrayList2.add("one");
        myArrayList2.add("three");
        myArrayList2.add("two");

        assertFalse(myArrayList.equals(myArrayList2));
    }

    @Test
    public void isSize() {

        assertEquals(3, myArrayList.size());

        myArrayList.add("four");
        assertEquals(4, myArrayList.size());

        myArrayList.delete("one");
        assertEquals(3, myArrayList.size());
    }

    @Test
    public void isGet_true() {

        assertEquals("one", myArrayList.get(0));
        assertEquals("two", myArrayList.get(1));
    }

    @Test
    public void isGet_testArrayIndexOutOfBoundsException() {

        ArrayIndexOutOfBoundsException thrown = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            myArrayList.get(25);
        }, "ArrayIndexOutOfBoundsException was expected");
        Assertions.assertEquals("the index is incorrect", thrown.getMessage());
    }


}
