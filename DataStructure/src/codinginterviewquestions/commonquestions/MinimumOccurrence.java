package codinginterviewquestions.commonquestions;

import java.util.Scanner;

public class MinimumOccurrence
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        System.out.print("Enter a character : ");
        char ch = sc.nextLine().charAt(0);
        int minCount = Integer.MAX_VALUE;

        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                int count = 0;
                for(int j =i;j<str.length();j++)
                {
                    if(str.charAt(j)==ch)
                    {
                        count++;
                    }
                }
                if(count < minCount)
                {
                    minCount = count;
                }
            }
        }
        if(minCount == Integer.MAX_VALUE)
        {
            System.out.println("The character "+ch+" is not present in the string");
        }
        System.out.println("The minimum number of occurences of "+ch+" in the string is "+minCount);
    }

}
