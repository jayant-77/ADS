package DS;
import java.util.*;


    class Node2
            {
              int data;
              Node2 left,right;
            
              Node2(int m )
              {
                  data = m;
                  left=null;
                  right = null;
              }
            }
    
    class Tree
    {
        Node2 root;
    
        Tree()
        {
            root = null;
        }
        
      public void preorder(Node2 n)
      {
          if(n == null)
              return;
         System.out.print(n.data +" ");
         preorder( n.left);
         preorder(n.right);
          
      }
       
    
      public void postorder(Node2 n)
      {
          if(n == null)
              return;
          
         postorder( n.left);
         postorder(n.right);
         System.out.print(n.data +" ");
          
      }
       public void Inorder(Node2 n)
      {
          if(n == null)
          {
              return;
          }
          
         Inorder( n.left);
          
         System.out.print(n.data +" ");
         
         Inorder(n.right);
         
      }
       
      void preorder()
      {
          preorder(root);
      }
      
       void postorder()
      {
          postorder(root);
      }
       
        void Inorder()
      {
          
          Inorder(root);
      }
    
    

    public static void main(String args[])
    {
        Tree t = new Tree();
        Scanner fc = new Scanner(System.in);
        
        while(true)
        {
            System.out.println(" 1.root \n 2.root.left \n 3.root.right \n 4.Preorder \n 5.Postorder \n 6.Inorder \n 7.exit");
            System.out.println("Enter your choice :");
          
            switch(fc.nextInt())
            {
                case 1:
                           t.root = new Node2(fc.nextInt());
                           break;
                           
                case 2:
                            t.root.left = new Node2(fc.nextInt());
                            t.root.left.left = new Node2(fc.nextInt());
                            t.root.left.right = new Node2(fc.nextInt());
                            break;
                            
                case 3: 
                            t.root.right = new Node2(fc.nextInt());
                            
                            break;
                            
                case 4:
                             System.out.println("Inside preorder ");
                             t.preorder();
                             System.out.println();
                             break;
                case 5:
                              System.out.println("Inside postorder ");
                              t.postorder();
                              System.out.println();
                              break;
                case 6: 
                              System.out.println("Inside Inorder");
                              t.Inorder();
                              System.out.println();
                              break;
                case 7:
                             fc.close();
                             System.exit(0);
            }
      /*  t.root = new Node2(5);
        t.root.left = new Node2(7);
        t.root.right = new Node2(9);
        t.root.left.left = new Node2(11);
        t.root.left.right = new Node2(13);
        
        System.out.println("Inside preorder ");
        t.preorder();
         System.out.println();
         System.out.println("Inside postorder ");
         t.postorder();
          System.out.println();
          System.out.println("Inside Inorder");
          t.Inorder();*/
        }
    }
}