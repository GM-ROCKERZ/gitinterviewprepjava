package Arrays;

public class ArrayElementMaxDifference
{
    static int maxDiff(int arr[])
    {
        int n = arr.length;
        int res = arr[1]-arr[0],minVal = arr[0];

        for(int j = 1;j<n;j++)
        {
            res = Integer.max(res,arr[j]-minVal);
            minVal = Integer.min(minVal,arr[j]);
        }
        return res;
    }

    public static void main(String args[])
    {
        int arr[] = {2,3,10,6,4,8,1};
        int result = maxDiff(arr);
        System.out.println(result);
    }
}
