package interviewPrep;

public class ReverseWord
{
    static String reWord(String str)
    {
        StringBuilder reverseWords = new StringBuilder();
        String[] words = str.split("");
        for (int i = words.length-1;i>=0;i--)
            reverseWords.append(words[i]+ "");
        return reverseWords.toString().trim();
    }
    public static void main(String args[])
    {
        String str= "This is Gopal Mishra";
        String result  = reWord(str);
        System.out.println(result);

    }
}
