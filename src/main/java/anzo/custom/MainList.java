package anzo.custom;

/**
 * Created by andreyz on 27.09.16.
 */
public class MainList {

    public static void main(String[] args) {


        CustomArrayList list = new CustomArrayList();


        list.add(0.1, "RANDOM");
        System.out.println(list);
        list.add(0.1, "RANDOM-2");
        System.out.println(list);
        list.add(0.1, "RANDOM-3");
        System.out.println(list);


    }
}
