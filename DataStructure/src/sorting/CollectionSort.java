package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort
{
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(2);
        list.add(0);
        Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
