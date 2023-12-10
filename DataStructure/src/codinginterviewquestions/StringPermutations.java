package codinginterviewquestions;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations
{
    public static void main(String args[])
    {
        String str = "ABC";
        List<String> permutations = getPermutations(str);
        System.out.println("Permutations of the "+str +":" +permutations);
    }

    public static List<String> getPermutations(String str)
    {
        List<String> permutations = new ArrayList<>();
        if(str.length()==0|| str == null)
            return permutations;

        getPermutations(str.toCharArray(),0,permutations);
        return permutations;
    }

    private static void getPermutations(char[] str, int index, List<String> permutations)
    {
        if(index==str.length-1)
        {
            permutations.add(new String(str));
        }
        else
        {
            for(int i=index;i<str.length;i++)
            {
                swap(str,index,i);
                getPermutations(str,index+1,permutations);
                swap(str,index,i);
            }
        }
    }

    private static void swap(char[] str, int i, int j)
    {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }


}
