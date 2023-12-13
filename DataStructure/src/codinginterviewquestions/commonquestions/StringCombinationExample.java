package codinginterviewquestions.commonquestions;

public class StringCombinationExample
{
    public static void main(String args[])
    {
        String str = "GOD";
        int n = str.length();
        System.out.println("All possible combinations of the string\""+str+"\":");
        combinations("",str);
    }

    private static void combinations(String prefix, String str)
    {
        int n = str.length();
        if(n==0)
        {
            System.out.println(prefix);
        }
        else
        {
            for(int i = 0;i<n;i++)
            {
                combinations(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n));
            }
        }

    }
}
