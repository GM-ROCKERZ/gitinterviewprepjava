package codinginterviewquestions.commonquestions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicates
{
    public static void main(String args[])
    {
        ArrayList<Integer> listwithduplicates = new ArrayList<>(Arrays.asList(1,2,3,4,3,2,5));
        LinkedHashSet<Integer> set = new LinkedHashSet<>(listwithduplicates);
        listwithduplicates.clear();
        listwithduplicates.addAll(set);

        for(Integer num:listwithduplicates)
        {
            System.out.print(num+" ");
        }
    }
}
