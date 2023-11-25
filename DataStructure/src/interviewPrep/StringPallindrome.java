package interviewPrep;

public class StringPallindrome
{
    public static boolean isPallindrom(String str)
    {
        int n = str.length()-1;
        for(int i =0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i))
                return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        String str = "anna";
        if(isPallindrom(str))
            System.out.println("String is pallindrom");
        else
            System.out.println("Its not pallindrom");
    }
}
