package DS;
class InsertionSort
{
    public void Insertion_sort(int a[],int n)
    {
        
    int j,temp=0;
    for(int i=1;i<n;i++)
    {
        temp =a[i];
        j=i;
        
        while(j >0 && a[j-1]> temp)
        {
            a[j] = a[j-1];
            j--;
        }
        a[j] =temp;
    }
    }
    public static void main(String args[])
    {
        InsertionSort s = new InsertionSort();
        int a[] = {5,1,6,2,3,4};
        int n = a.length;
        
        s.Insertion_sort(a, n);
        
        System.out.println("Sorted Array");
        for(int i=0;i<n;i++)
        {
                System.out.print(a[i]+" ");
        }
    }
}