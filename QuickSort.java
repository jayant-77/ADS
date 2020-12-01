package DS;
class QuickSort
{
    int partition(int array[],int i,int j)
    {
       int pivot = array[(i+j)/2];
        while(i<=j)
        {
            while(array[i]<pivot)
            {
                i++;
            }
            
            while(array[j]>pivot)
            {
                j--;
            }
            if(i<=j)
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
    
    public void Quick_sort (int array[],int i,int j)  
    {
        int pi = partition(array, i, j);
        
             if(i<pi-1)
             {
                 Quick_sort(array,i,pi-1);
             }
             if(pi<j)
             {
                  Quick_sort(array,pi,j);
             }
        
        
    }
    void Display(int array[])
    {
        for(int i : array)
        {
            System.out.print(i+" ");
        }
    }
    public static void main (String args[])
    {
        QuickSort qs = new QuickSort();
       int a[] ={15,9,7,13,12,16,4,18,11};
       int n = a.length;
       
      // qs.partition(a, 0, n-1);
       qs.Quick_sort(a,0,n-1);
       qs.Display(a);
       
    }
}