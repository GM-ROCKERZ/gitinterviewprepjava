package Recursion;

public class PallindromCheck
{
    public static void main(String args[])
    {
        String temp = "abba";
        System.out.println(isPallindrom(temp,0,3));
    }
    static boolean isPallindrom(String str,int start,int end)
    {
        if(start>=end)
            return true;
        return(str.charAt(start)==str.charAt(end))&&
                isPallindrom(str,start+1,end-1);
    }
}
