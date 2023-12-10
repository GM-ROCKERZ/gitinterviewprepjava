package codinginterviewquestions.commonquestions;

import java.util.Arrays;

public class AverageOfEvenNumbersExample
{
    public static void main(String args[])
    {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        double avg = Arrays.stream(numbers)
                .filter(n->(n%2==0))
                .mapToDouble(n->n)
                .average()
                .orElse(0.0);
        System.out.println("The average of even number is :" +avg);
    }
}
