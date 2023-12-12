package codinginterviewquestions.commonquestions;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(3,5,7,9,11));

        for(int num:arr1)
        {
            if(arr2.contains(num) && arr3.contains(num))
            {
                System.out.println("Common element found :" +num);
            }
        }
    }
}
