package DS;
class Node
{
    int data;
    Node fLink;
    Node bLink;
    
    Node(int data)
    {
        this.data = data;
        fLink = bLink = null;
    }
}
class dLinked
{
   private Node start;
   private int length;

dLinked()
{
    start = null;
    length = 0;
}
public void insertBeg(int d)
{
    Node newNode = new Node(d);
    
    if(start == null)
    {
        start = newNode;
    }
    else
    {
        start.bLink = newNode;
        newNode.fLink = start;
        //newNode = start;
        start = newNode;
    }
    length++;
}
public void insetEnd(int d)
{
    Node newNode = new Node(d);
    
    if(start == null)
    {
        start = newNode;
    }
    else
    {
        Node n =start;
        while (n.fLink!= null)
        {
           n= n.fLink;
        }
        n.fLink = newNode;
        newNode.bLink = n;
    }
    length++;
}

public void intpos(int d,int p)
{
    if (p == 1)
    {
        insertBeg(d);
    }
    else if (p>length)
    {
        insetEnd(d);
    }

   else
   {
       int i=1;
       Node n = start;
       
       while(n.fLink!=null)
       {
           i++;
           if (p == i)
               break;
           n = n.fLink;
                   
       }
       Node newNode = new Node (d);
       newNode.bLink = n;
       newNode.fLink = n.fLink;
       n.fLink.bLink = newNode;
       n.fLink = newNode;
           
           }
    }
   
   public void Delbeg()
   {
       if (start == null)
       {
           System.out.println("List is empty");
       }
       else
       {
           Node n = start;
           start = n.fLink;
           start.bLink = null;
       }
       length--;
   }
   public void Delend()
   {
       if (start == null)
       {
           System.out.println("List is empty");
       }
       else
       {
           Node n = start;
           
           while(n.fLink.fLink != null)
           {
               n = n.fLink;
           }
           
           n.fLink.bLink = null;
           n.fLink = null;
       }
       length--;
   }
   
   public void Delpos(int p)
   {
       if (p == 1)
       {
           Delbeg();
       }
       else if (p>length)
       {
           Delend();
       }
       else
       {
           int i=1;
           Node n = start;
           
           while(n.fLink!=null)
           {
               i++;
               if(p == i)
               break;
               n= n.fLink;
           }
           n.fLink.fLink.bLink = n;
           n.fLink = n.fLink.fLink;
       }
   }
   
   public void Displayf()
   {
       Node n = start;
       while(n!= null)
       {
           System.out.print(n.data+" -> ");
           n=n.fLink;
       }
       //System.out.print(n.data);
   }
   
   public void Displayb()
   {
       Node m = start;
       
       while(m.fLink != null)
       {
          m = m.fLink;
       }
       while(m!=null)
       {
           System.out.print(m.data+" <- ");
           m = m.bLink;
          // m.bLink = m;
       }
       //System.out.print(m.data);
      
   }
   
   public static void main(String[]args )
   {
dLinked dl = new dLinked ();
dl.insertBeg(10);
dl.insertBeg(20);

dl.insertBeg(30);

dl.insetEnd(40);

dl.intpos(2,4);

dl.Displayf
();
// 30
//--> 20 --> 10 --> 2 --> 40
System.out.println();
dl.Delend();
dl.Delbeg();
dl.Displayf
();
// 20
//--> 10 --> 2
System.out.println();
dl.Displayb
();
System.out.println();
// 2 <
//10 < 20
}
}

