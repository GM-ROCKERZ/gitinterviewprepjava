package codinginterviewquestions;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ReplaceChar
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        System.out.println("enter the character to replace");
        char oldChar = sc.next().charAt(0);
        System.out.println("Enter the character to replace with");
        char newChar = sc.next().charAt(0);
        String newstr = replaceChar(str,oldChar,newChar);
        System.out.println("New modified String :"+newstr);


    }

    private static String replaceChar(String str, char oldChar, char newChar)
    {
        char[] chars = str.toCharArray();
        for(int i =0;i<chars.length;i++)
        {
            if(chars[i]==oldChar)
            {
                chars[i] = newChar;
            }
        }
        return new String(chars);
    }
}
