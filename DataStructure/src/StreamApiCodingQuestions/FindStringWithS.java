package StreamApiCodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringWithS
{
    public static void main(String args[])
    {
        String[] arr = {"apple","banana","Strawberry","strawberry","cherry","Salsa","grape"};

        List<String> listStr = Arrays.asList(arr);
        List<String> strWithS = listStr.stream()
                .filter(s->s.toLowerCase().startsWith("s"))
                .collect(Collectors.toList());
        System.out.println(strWithS);
        //strWithS.forEach(System.out::println);
    }
}
