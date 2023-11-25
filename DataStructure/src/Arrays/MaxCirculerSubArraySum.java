package Arrays;

public class MaxCirculerSubArraySum
{
    static int normalMaxSum(int arr[])
    {
        int res = arr[0];
        int maxEnding = arr[0];
        int n = arr.length;
        for(int i =1;i<n;i++)
        {
            maxEnding = Math.max(arr[i],maxEnding+arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
    static int overAllMaxSum(int arr[])
    {
        int n = arr.length;
        int max_normal = normalMaxSum(arr);
        if(max_normal < 0)
            return max_normal;
        int arr_sum = 0;
        for(int i =0;i<n;i++)
        {
            arr_sum += arr[i];
            arr[i] =  -arr[i];
        }
        int max_circular = arr_sum + normalMaxSum(arr);
        return Math.max(max_normal,max_circular);
    }
    public static void main(String args[])
    {
        int arr[] = {8,-4,3,-5,4};
        int max_sum = overAllMaxSum(arr);
        System.out.println("max circular sub array sum :" +max_sum);
    }
}
