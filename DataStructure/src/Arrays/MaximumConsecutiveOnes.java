package Arrays;

public class MaximumConsecutiveOnes
{
    static int maxConsecutiveOnes(int arr[])
    {
        int res =0,curr = 0;
        int n = arr.length;
        for(int i =0;i<n ; i++)
        {
            if(arr[i]==0)
                curr = 0;
            else {
                curr++;
                res = Math.max(res,curr);
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        int arr[] = {0,1,1,0,1,1,1};
        int result = maxConsecutiveOnes(arr);
        System.out.println("max consicutive ones in arrays is :"+ result);
    }
}
