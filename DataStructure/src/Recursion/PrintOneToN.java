package Recursion;

public class PrintOneToN
{
    public static void main(String []args)
    {
        int n = 4;
        print1toN(n);
    }

    private static void print1toN(int n)
    {
        if(n==0)
            return;
        print1toN(n-1);
        System.out.println(n+ "");
    }


}
