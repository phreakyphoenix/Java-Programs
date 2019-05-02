//This program creates a numeriuc tree and displays the duplicate elements in it.
import java.util.*;
class tree
{
    static Scanner sc=new Scanner(System.in);
    node create(node s,node p)
    {
        if(s==null)
        {
            s=p;
            return s;
        }
        if(p.n>s.n)
        {
            s.right=create(s.right,p);
        }
        else
        {
            s.left=create(s.left,p);
        }
        return s;
    }

    void dup(node root, node p)
    {
        if(root!=null)
        {
            dup(root.left,p);
            int x= root.n;
            int c = count(x,p);
            if(c>1)
                System.out.println(x+"\t"+c);
            dup(root.right,p);
        }
    }

    public int count(int x, node p)
    {
        if(p!=null)
        {
            count(x,p.left);
            if(p.n==x)
                return 1+count(x,p.right);
            else
                return count(x,p.right);
        }
    }
}