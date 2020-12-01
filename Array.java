package DS;
class Array
{
    public static void main(String args[])
    {
    long arr[] = new long [100];
    int n = 0;
    int j;
    long search;
    
    arr[0] = 48;
    arr[1] = 54;
    arr[2] = 89;
    arr[3] = 24;
    arr[4] = 35;
    arr[5] = 55;
    arr[6] = 67;
    arr[7] = 74;
    arr[8] = 15;
    arr[9] = 50;
    n=10;
    
    for(j=0;j<n;j++)
    {
        System.out.print(arr[j]+" ");
       // System.out.println();
    }
      System.out.println();
    //===============================search element=========================================
    search = 55;
    for(j=0;j<n;j++)
    
    
        if(arr[j] == search)
        
           break;
    
        if(j == n)
            System.out.println("not found......");
        
        else
            System.out.print("found ..... ");
        System.out.println();
        
     //================================delete key==============================================
     
      search = 35;
      int k;
      for(j=0;j<n;j++)
      
          
      if(arr[j] == search)
          break;
          
      for(k=j;k<n;k++)
      
          arr[k] = arr[k+1];
      
      n--;
      
      //=================================display===========================================
      
      for(j=0;j<n;j++)
          
         System.out.print(arr[j]+" ");
          
    
}    
}