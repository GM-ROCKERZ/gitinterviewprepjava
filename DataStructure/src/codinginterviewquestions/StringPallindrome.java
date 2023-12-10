package codinginterviewquestions;

import java.util.Scanner;

public class StringPallindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check: ");
        String str = sc.nextLine();
        if(isPallindrome(str))
        {
            System.out.println("Given string is pallindrome: "+str);

        }
        else
        {
            System.out.println("Given string is not pallindrome"+str);
        }


    }

    private static boolean isPallindrome(String str)
    {
        int len = str.length();
        for(int i =0;i<len/2;i++)
        {
            if(str.charAt(i) != str.charAt(len-i-1))
                return false;
        }
        return true;
    }
}
