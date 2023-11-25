package interviewPrep;

public class MaxMinNumberInArray
{
    public static int max(int[] arr)
    {
        int n = arr.length;
        int max = arr[0];
        for (int i =0;i<n;i++)
        {
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
    public static int min(int[] arr)
    {
        int n = arr.length;
        int min = arr[0];
        for(int i =0;i<n;i++)
        {
            if(min > arr[i])
                min = arr[i];
        }
        return min;
    }

    public static void main(String args[])
    {
        int arr[] = {4,781,90,8,103};
        int result = max(arr);
        System.out.println("maximum element in given array is : " +result );
        int min = min(arr);
        System.out.println("minimum element in given array is :" +min);
    }
}
