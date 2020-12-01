package DS;
class Selection
{
    int a[];
    int k;
    
    public void selection_sort(int a[],int k)
    {
        int i,j,min;
        for(i=0;i<k-1;i++)
        {
            min=i;
            for(j=i+1;j<k;j++)
            {
                if(a[j]<a[min])
                
                {
                   
                   min=j;  
                }
                 swap(i,min);  
            }
        }
    }
      public void swap(int n,int m)
    {
        int temp;
         temp = a[n];
        a[n] = a[m];
        a[m] = temp;
    }

      
    public static void main(String args[])
    {
        Selection s = new Selection();
        int a[] = {40,64,36,10,4,25};
        int k = a.length;
        
        s.selection_sort(a,k);
        
        System.out.println("Sorted array");
        for(int i=0;i<k;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}