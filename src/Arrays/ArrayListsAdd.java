package Arrays;

import java.util.*;

public class ArrayListsAdd {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size()+" ");
        list.add(88);
        list.add(89);
        list.add(90);
        list.add(99);
        System.out.println(list);
        list.set(1,43);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);


        System.out.println(list.size() +" ");
    }
}
