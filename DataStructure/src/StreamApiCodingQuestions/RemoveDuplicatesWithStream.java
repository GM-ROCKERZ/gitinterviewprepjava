package StreamApiCodingQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesWithStream
{
    public static void main(String args[])
    {
        List<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);
        listWithDuplicates.add(2);
        listWithDuplicates.add(4);
        listWithDuplicates.add(4);

        List<Integer> listWithNoDup = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        listWithNoDup.forEach(System.out::println);
    }
}
