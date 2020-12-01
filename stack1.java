package DS;
import java.util.*;
public class stack1
{
         int[] stack;
        private int top;
        private int n =5;
   
    
    stack1()
    {
       top =0;
      
       
      stack = new int[n];
       
    }
    
      public void checkMatch(String s)
    {
        for (int i =0;i<s.length();i++)
        {
            
            if (s.charAt(i) == '{')
            {
                push(1);
            }
            else if (s.charAt(i) == '}')
            {
                if(empty())
                {
                    System.out.println("Error : Too many closing bracket");
                  
                }
           
                    pop();
            }
        }
    }
    
    public void push(String s)
    {
              if(top >=n)
           {
               System.out.println("Error : Stack is overflow");
             
           }
           else
           {
                stack [top++] ;
             
           }
          
    }
    
         public int pop ()
         {
             if (top<=0)
             {
                 System.out.println("Stack is underflow");
                 return -1;
             }
             else
             {
                 return stack[top--];
             }
         }
         
         public boolean empty()
         {
             return top == 0;
             
         }
         
        public int top()
         {
            if (empty()) 
            {
                System.out.println("stack is on empty stack");
                return -1;
            }
            return stack[top-1];
         }

         public static void main(String args [])
            {
                stack1 s1 = new stack1();
               Scanner sc = new Scanner (System.in);
               while(true)
               {
               System.out.println("1. PUSH");
               System.out.println("2. POP");
               System.out.println("3. EMPTY");
               System.out.println("4. TOP");
               System.out.println("5. EXIT");
              
               
               System.out.println("Enter a choice here: ");
                
               int m = sc.nextInt();
               String s = sc.next();
               
               
               switch (m)
               {
                   case 1:
                       System.out.println("push the element");
                       // String s = sc.next();
                           s1.checkMatch(s);
                            break;
                            
                   case 2:
                       System.out.println("pop the element");
                      // String s = sc.next();
                         s1.checkMatch(s);
                         break;
                         
                   case 3:
                       System.out.println("check the stack is empty or not");
                            s1.empty();
                            break;
                            
                   case 4:
                       System.out.println("check the position of top element");
                            s1.top();
                            break;
                   default:
                      sc.close();
                      System.exit(0);
               
               } 
               }
               
                       
               
            }         }

        
           
               
            
             
                 
                     
            
    
