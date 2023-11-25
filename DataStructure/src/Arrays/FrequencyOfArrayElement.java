package Arrays;

public class FrequencyOfArrayElement
{
    static void printFreq(int arr[])
    {
        int n = arr.length;
        int frq =1;
        int i = 1;
        while(i<n)
        {
            while(i<n && arr[i]==arr[i-1])
            {
                frq++;
                i++;
            }
            System.out.println(arr[i-1]+ " " +frq);
            i++;
            frq=1;
        }
        if(n==1 || arr[n-1]!=arr[n-2])
            System.out.println(arr[n-1]+ " " +1);
    }

    public static void main(String args[])
    {
        //int arr[] = {10,10,10,30,30,40};
        int arr[] = {40,50,50,50};
        printFreq(arr);
    }
}
