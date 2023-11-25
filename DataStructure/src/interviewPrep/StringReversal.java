package interviewPrep;

public class StringReversal
{
    static String reverseString(String str)
    {
        StringBuilder reverse = new StringBuilder();
        for(int i = str.length()-1;i>=0;i--)
        {
            reverse.append(String.valueOf(str.charAt(i)));
        }
        return reverse.toString();
    }

    public static void main(String args[])
    {
        String str = "apple";
        String reverseString = reverseString(str);
        System.out.println("Reverse String :" +reverseString);
    }
}
