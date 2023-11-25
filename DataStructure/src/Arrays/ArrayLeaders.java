package Arrays;

public class ArrayLeaders
{
    static void leaders(int arr[])
    {
        int n = arr.length;
        int curr_leader = arr[n-1];
        System.out.print(curr_leader);
        for(int i = n-2;i>=0;i--)
        {
            if(curr_leader < arr[i])
            {
                curr_leader = arr[i];
                System.out.print(" " +curr_leader);
            }
        }
    }

    public static void main(String args[])
    {
        int arr[] = {7,10,4,10,6,5,2};
        leaders(arr);
    }
}
