package codinginterviewquestions.commonquestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingCharInString
{
    public static void main(String args[])
    {
        String str = "Hello, World";
        Map<Integer,Long> charCount = str.chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        charCount.forEach((k,v)-> System.out.println("Character "+(char)k.intValue()+" occurs "+v+" times"));
    }
}
