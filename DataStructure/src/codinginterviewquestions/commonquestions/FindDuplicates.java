package codinginterviewquestions.commonquestions;

import java.util.*;

public class FindDuplicates
{
    public static List<Integer>findDuplicates(List<Integer>list)
    {
        Set<Integer> set = new HashSet<>();

        List<Integer> duplicates = new ArrayList<>();

        for(Integer i : list)
        {
            if(!set.add(i))
                duplicates.add(i);
        }
        return duplicates;
    }
    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(1,2,3,1,4,2,5);
        List<Integer> duplicates = findDuplicates(list);
        System.out.println("Duplicates:"+duplicates);
    }
}
