package DS;
import java.util.Scanner;
class Node1
{
    int data;
    Node1 next ;

Node1 (int d)
{
data = d;
next = null;
}
}
class LList
{
  private Node1 start;
  private int length;

LList()
{
  start = null;
  length =0;  
}

public void insertbeg(int d)
{
    Node1 n = new Node1(d);
    
    if (start == null)
    {
        start = n ;
    }
    
    else
    {
    
        n.next = start;
        start = n;
    }
}

public void insertEnd(int d)
{
    Node1 n = new Node1(d);
    
    if(start == null)
    {
        start = n;
    }
    
    else 
    {
        Node1 s = start;
        
        while(s.next!= null)
        {
            s = s.next;
        }
         s.next = n;
    }
}

public void Delfirst()
{
    if (start == null)
    {
        System.out.println("List is Empty");
    }
    else
    {
    start = start.next;
    }
}

public void Delend()
{
    Node1 s = start;
   if (start == null) 
   {
        System.out.println("List is Empty");
   }
   else
   {
       while(s.next.next!=null)
       {
           s = s.next;
       }
       s.next = null;
   }
}

public void Display()
{
    Node1 s = start;
    while(s!= null)
    {
        System.out.print(s.data+" ->");
        s = s.next;
    }
     System.out.println();
}

public static void main(String args[])
{
    LList l1 = new LList();
    Scanner sc = new Scanner(System.in);
    
    while(true)
    {
         System.out.println("1.insertbeg \n 2.insertEnd \n 3.Delfirst \n 4.Delend \n 5.Display \n 6.Exit");
          System.out.println("Enter your Choice :");
        switch(sc.nextInt())
        {
            case 1:
                     l1.insertbeg(sc.nextInt());
                     break;
                     
            case 2:
                    l1.insertEnd(sc.nextInt());
                    break;
                    
            case 3:
                    l1.Delfirst();
                    break;
                    
            case 4 :
                   l1.Delend();
                   break;
                   
            case 5:
                    l1.Display();
                    break;
                    
            default:
                      sc.close();
                      System.exit(0);
        }
    }
}
}
