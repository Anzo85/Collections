package anzo.custom;

public interface CustomList {


    boolean add(String element);

    void add(int index, String element);

    void add(Double n, String element);

    void remove(int index);

    int size();

    boolean isEmpty();

    String get(int index);

}
