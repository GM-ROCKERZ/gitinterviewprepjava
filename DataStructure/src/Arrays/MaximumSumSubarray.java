package Arrays;

public class MaximumSumSubarray
{
    static int maxSum(int arr[])
    {
        int n = arr.length;
        int maxEnding = arr[0];
        int result = arr[0];

        for(int i = 1;i<n;i++)
        {
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            result = Math.max(result,maxEnding);
        }
        return  result;
    }

    public static void main(String args[])
    {
        int arr[] = {-3,8,-2,4,-5,6};
        int sum = maxSum(arr);
        System.out.println("Maximum sub array sum :" + sum);
    }
}
