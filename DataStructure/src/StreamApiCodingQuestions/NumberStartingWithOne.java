package StreamApiCodingQuestions;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne
{
    public static void main(String args[])
    {
        List<Integer> mylist = Arrays.asList(10,15,8,49,25,19,32);
        mylist.stream()
                .map(s->s+"")
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);
    }
}
