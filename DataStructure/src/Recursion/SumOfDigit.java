package Recursion;

public class SumOfDigit
{
    public static void main(String args[])
    {
        int n = 873;
        int sum = getSum(n);
        System.out.println(sum);
    }

    static int getSum(int n)
    {
        if(n==0)
            return 0;
        else
            return getSum(n/10)+n%10;
    }
}
