package DS;
class Match
{
    String s ="";
    Mystack st;
   
    Match()
    {
        s = "{{}}";
        st = new Mystack ();
        
    }

    public int checkMatch()
    {
        for (int i =0;i<s.length();i++)
        {
            
            if (s.charAt(i) == '{')
            {
                st.push(1);
            }
            else if (s.charAt(i) == '}')
            {
                if(st.empty())
                {
                    System.out.println("Error : Too many closing bracket");
                     return -1;
                }
            
           st.pop();
           //System.out.println("Popping successful");
            }
        }
                  
        if(st.empty())
        {
            System.out.println("matching bracket Successfully");
            return 1;
        }
        else
        {
            System.out.println("Remaing too many closing bracket");
            return 0;
        }
    }
}

       class Bracket
       {
           public static void main (String []args)
           {
               Match m = new Match ();
               m.checkMatch();
           }
       }
