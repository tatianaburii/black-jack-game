package homework_12;

import java.util.Arrays;

public class MyArrayList implements Collection {
    private int count;
    private Object[] myArrayList;

    public MyArrayList() {
        myArrayList = new Object[10];
        count = 0;
    }

    public boolean add(Object obj) {
        checkAndChangeSize();
        myArrayList[count++] = obj;
        return true;
    }

    private void checkAndChangeSize() {
        if (myArrayList.length < count + 2) {
            int new_size = myArrayList.length * 2;
            Object[] myArrayList1 = new Object[new_size];
            System.arraycopy(myArrayList, 0, myArrayList1, 0, myArrayList.length);
            myArrayList = myArrayList1;
        }
    }

    public boolean add(int index, Object obj) {
        checkAndChangeSize();
        if (index > count) {
            index = count;
        }
        if (count + 1 - index >= 0) {
            System.arraycopy(myArrayList, index, myArrayList, index + 1, count + 1 - index);
        }
        myArrayList[index] = obj;
        count++;
        return true;

    }

    public boolean clear() {
        myArrayList = new MyArrayList[10];
        this.count = 0;
        return true;
    }

    public int size() {
        return count;
    }

    public boolean delete(int index) {
        if (index >= count || index < 0) return false;
        System.arraycopy(myArrayList, index + 1, myArrayList, index, count - index);
        count--;
        return true;
    }

    public boolean delete(Object obj) {
        for (int i = 0; i < count; i++) {
            if (myArrayList[i].equals(obj)) {
                delete(i);
                return true;
            }
        }
        return false;
    }

    public Object get(int index) {
        if (index < 0 || index >= count) {
            throw new ArrayIndexOutOfBoundsException("the index is incorrect");
        }
        return myArrayList[index];
    }

    public boolean contain(Object o) {
        for (int i = 0; i < count; i++) {
            if (o.equals(myArrayList[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Collection str) {
        if (str == this) {
            return true;
        }
        if (this.getClass() != str.getClass()) {
            return false;
        }
        MyArrayList list = (MyArrayList) str;
        return this.count == list.count && Arrays.equals(this.myArrayList, list.myArrayList);
    }
}

