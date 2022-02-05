package homework_12;

public class MyArrayListRun {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 1; i < 5; i++) {
            myArrayList.add("n_" + i);
        }
        System.out.println(myArrayList.delete("n_2"));

    }
}
