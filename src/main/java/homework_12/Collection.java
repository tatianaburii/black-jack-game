package homework_12;

public interface Collection {
    boolean add(Object o);//ok

    boolean add(int index, Object o);//ok

    boolean delete(Object o);//ok

    Object get(int index);

    boolean contain(Object o);//ok

    boolean equals(Collection str);//ok

    boolean clear();//ok

    int size();

}

