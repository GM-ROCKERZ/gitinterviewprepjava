package interviewPrep;


import java.util.LinkedHashMap;
import java.util.Map;

public class CountLetters
{
    static Map<Character,Integer> countLetters(String str)
    {
        Map<Character,Integer> letters = new LinkedHashMap<>();
        for(int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(letters.containsKey(ch))
            {
                letters.put(ch,letters.get(ch)+1);
            }
            else
            {
                letters.put(ch,1);
            }
        }
        return letters;
    }
    public static void main(String args[])
    {
        String str = "Javanerds";
        Map<Character,Integer> result = countLetters(str);
        for(Map.Entry<Character,Integer> e: result.entrySet())
        {
            System.out.println("Character is :"+ e.getKey()+" and its count is "+ e.getValue());
        }
    }
}
