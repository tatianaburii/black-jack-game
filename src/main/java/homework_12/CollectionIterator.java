package homework_12;

import java.util.Iterator;
import java.util.function.Consumer;


public class CollectionIterator implements Iterator {
    private MyArrayList myArrayList;
    private int count = 0;

    @Override
    public boolean hasNext() {
        return count < myArrayList.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return myArrayList.get(count++);
        }
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove");
    }

    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }


    public CollectionIterator(MyArrayList myArrayList) {
        this.myArrayList = myArrayList;
    }

}


