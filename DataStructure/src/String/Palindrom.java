package String;

public class Palindrom
{
    public static void main(String args[])
    {
        String str = "ABCCBD";
        if (isPal(str))
            System.out.println("given string is Palindrom " + str);
        else
            System.out.println("given string is not Palindrom");
    }
    static boolean isPal(String str)
    {
        int begin =0 ;
        int end = str.length()-1;

        while(begin<end)
        {
            if(str.charAt(begin)!=str.charAt(end))
                return false;
            begin++;
            end--;

        }
        return true;
    }
}
