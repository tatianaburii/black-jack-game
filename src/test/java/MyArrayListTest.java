import homework_12.MyArrayList;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class MyArrayListTest {
    private MyArrayList myArrayList;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        myArrayList = new MyArrayList();
    }

    @Test
    public void testListInit() {
        assertTrue(myArrayList.size() == 0);
    }

    @Test
    public void testAddElements() {
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");

        assertEquals("one", myArrayList.get(0));
        assertEquals("two", myArrayList.get(1));
        assertEquals("three", myArrayList.get(2));
        assertTrue(myArrayList.size() == 3);

    }

    @Test
    public void testAddElementsOfIndex() {
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");

        myArrayList.add(1, "point");
        assertEquals("one", myArrayList.get(0));
        assertEquals("point", myArrayList.get(1));
        assertEquals("two", myArrayList.get(2));

    }

    @Test
    public void testDelete() {
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");

        assertTrue(myArrayList.delete(1));
        assertEquals("three", myArrayList.get(1));
        assertFalse(myArrayList.delete(28));
        assertTrue(myArrayList.size() == 2);
    }

    @Test
    public void testDeleteObject() {
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");

        assertTrue(myArrayList.delete("two"));
        assertEquals("three", myArrayList.get(1));
        assertFalse(myArrayList.delete("five"));
        assertTrue(myArrayList.size() == 2);
    }

    @Test
    public void testClear() {
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");

        myArrayList.clear();
        assertTrue(myArrayList.size() == 0);
    }

    @Test
    public void testContain() {
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");

        assertTrue(myArrayList.contain("one"));
        assertFalse(myArrayList.contain("five"));
    }

    @Test
    public void testEquals() {
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");

        MyArrayList myArrayList1 = new MyArrayList();
        MyArrayList myArrayList2 = new MyArrayList();
        myArrayList2.add("one");
        myArrayList2.add("two");
        myArrayList2.add("three");
        myArrayList1 = myArrayList;

        assertTrue(myArrayList.equals(myArrayList1));
        assertTrue(myArrayList.equals(myArrayList2));

        myArrayList2.add("four");
        assertFalse(myArrayList.equals(myArrayList2));
    }

    @Test
    public void testSize(){
        assertEquals(0, myArrayList.size());
        myArrayList.add("one");
        assertEquals(1, myArrayList.size());
        myArrayList.add("two");
        myArrayList.add("three");
        assertEquals(3, myArrayList.size());
        myArrayList.delete("one");
        assertEquals(2, myArrayList.size());
    }
    @Test
    public void testGet(){
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");

        assertEquals("one", myArrayList.get(0));
        assertEquals("two", myArrayList.get(1));
    }


}
