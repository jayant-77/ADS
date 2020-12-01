package DS;

class bubblesort
{
  
   int a[];
   int n;
    
  
    
    static void bubble(int a[],int n)
    {
        int i, j,flag=0;
        for(i=n-1;i>1;i--)
        {  
            for(j=0;j<i;j++)
            {
               if(a[j] > a[j+1])
               { 
                 int temp=0;
                  temp = a[j];
                   a[j] = a[j+1];
                      a[j+1] = temp;
                        // flag =1;     
                }
            
         
        
        
             /*  if (flag == 0)
              {
                   break;
              }*/
      
             }
        }
    
    } 
       
    

    public static void main(String args[])
    {
           bubblesort b = new bubblesort();
       int a[] = {40,64,36,10,4,25};
        int n = a.length;
       
      bubble(a,n);
      System.out.println("sorted array");
     for(int j=0;j<n;j++)
        
        {
           
          System.out.print(a[j]+" ");
         
        
        }
    
     
      
       }
    }
