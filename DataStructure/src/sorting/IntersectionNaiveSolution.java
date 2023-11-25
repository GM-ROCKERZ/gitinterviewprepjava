package sorting;

public class IntersectionNaiveSolution
{
    public static void main(String args[])
    {
        int a[] = new int[]{3,5,10,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};

        int m = a.length;
        int n = b.length;
        intersection(a,b,n,m);

    }

    static void intersection(int a[],int b[],int n,int m)
    {
        for(int i =0;i<m;i++)
        {
            if(i>0 && a[i-1]==a[i])
                continue;
            for(int j=0;j<n;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.print(a[i]+ " ");
                    break;
                }
            }
        }
    }
}
