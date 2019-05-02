//This program creates a numeriuc tree and counts the number of nodes in it.
import java.util.*;
class tree
{
    static Scanner sc=new Scanner(System.in);    
    int c=0;
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
    
    int count(node s)
    {
        if(s!=null)
        {
            c++;
            count (s.left);
            count (s.right);
        }
        return c;
    }

    public void main()
    {
        node s=null;
        node p;
        int ch=0;
        tree t=new tree();
        while(ch<3)
        {
            System. out. println("1>create tree");
            System. out. println("2>Count the no of nodes in tree");
            System. out. println("enter choice");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                p=new node();
                p.input();
                s=t.create(s,p);
                break;

                case 2:
                t.c=0;
                System.out.println("The no of nodes is "+t.count(s));
                break;

                default:System.out.println("Wrong Choice. Tree Terminated");
            }
        }
    }
}
OUTPUT:
1>create tree
2>Count the no of nodes in tree
enter choice
1
Enter number: 
5
1>create tree
2>Count the no of nodes in tree
enter choice
1
Enter number: 
8
1>create tree
2>Count the no of nodes in tree
enter choice
1
Enter number: 
4
1>create tree
2>Count the no of nodes in tree
enter choice
2
The no of nodes is 3
1>create tree
2>Count the no of nodes in tree
enter choice
1
Enter number: 
6
1>create tree
2>Count the no of nodes in tree
enter choice
2
The no of nodes is 4