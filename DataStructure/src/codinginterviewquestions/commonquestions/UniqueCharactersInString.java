package codinginterviewquestions.commonquestions;

public class UniqueCharactersInString
{
    public static boolean hasUniqueChars(String str)
    {
        if(str==null || str.length()>128)
        {
            return false;
        }
        boolean[] charSet = new boolean[128];
        for(int i =0;i<str.length();i++)
        {
            int val = str.charAt(i);
            if(charSet[val])
            {
                return false;
            }
            charSet[val] = true;
        }
        return  true;
    }
    public static void main(String args[])
    {
        String input = "india";
        boolean hasUnique = hasUniqueChars(input);
        System.out.println(hasUnique);
    }
}
