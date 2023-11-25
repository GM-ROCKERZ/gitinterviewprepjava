package Arrays;

import java.awt.desktop.PreferencesEvent;

public class LeftRotateByD
{
    static void leftRotate(int arr[],int d)
    {
        int n = arr.length;

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }
    static void reverse(int arr[],int low,int high)
    {
        while(low<high)
        {
            swap(arr[low],arr[high]);
            low++;
            high--;
        }
    }
    static void swap(int x,int y)
    {
        int temp = x;
        x=y;
        y= temp;
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int d = 2;
       int n = arr.length;
        leftRotate(arr,d);
        PrintTheArray(arr,n);


    }
    static void PrintTheArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
