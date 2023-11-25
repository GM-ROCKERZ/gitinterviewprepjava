package Numbers;

public class CountNumber
{
    public static void main(String args[])
    {
        int digitcount = countDigit(2356);
        System.out.println(digitcount);
    }

    public static int countDigit(int x)
    {
        int temp = 0;
        while(x>0)
        {
            x = x/10;
            temp++;
        }
        return temp;
    }
}
