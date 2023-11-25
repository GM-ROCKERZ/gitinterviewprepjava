package Arrays;

public class TrappingWater
{
    static int getWater(int arr[])
    {
        int n = arr.length;
        int lmax[] = new int[n];
        int rMax[] = new int[n];

        int res = 0;
        lmax[0] = arr[0];
        for(int i = 1;i<n;i++)
        {
            lmax[i] =Integer.max(arr[i],lmax[i-1]);
        }
        rMax[n-1] = arr[n-1];
        for(int j = n-2;j>=0;j--)
            rMax[j] =Integer.max(arr[j],rMax[j+1]);

        for(int i =1;i<n-1;i++)
        {

            res = res +(Integer.min(lmax[i],rMax[i])-arr[i]);

        }
        return res;
    }

    public static void main(String args[])
    {
        int arr[] = {5,0,6,2,3};
        int result = getWater(arr);
        System.out.println("this much water we can store "+ result);
    }

}
