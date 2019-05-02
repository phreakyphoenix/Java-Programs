//This program creates a numeriuc tree and can traverse it in pre, post and in order.
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
    
    void pre(node p)
    {
        if(p!=null)
        {
            p.dis();
            pre(p.left);
            pre(p.right);
        }
    }
    
    void inord(node p)
    {
        if(p!=null)
          {
            inord(p.left);
            p.dis();
            inord(p.right);
        }
    }
    
    void post(node p)
    {
        if(p!=null)
        {
            post(p.left);
            post(p.right);
            p.dis();
        }
    }
    
    public static void main()
    {
        node s=null;
        node p;
        int ch=0;
        tree t=new tree();
        while(ch<5)
        {
            System. out. println("1>create tree");
            System. out. println("2>pre order");
            System. out. println("3>In order");
            System. out. println("4>post order");
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
                System. out. println("root->left->right");
                t.pre(s);
                break;
                
                case 3:
                System. out. println("left->root->right");
                t.inord(s);
                break;
                
                case 4:
                System. out. println("left->right->root");
                t.post(s);
                break;
                
                default:System. out. println("error choice");
            }
        }
    }
}

OUTPUT:
1>create tree
2>pre order
3>In order
4>post order
enter choice
1
Enter number: 
5
1>create tree
2>pre order
3>In order
4>post order
enter choice
1
Enter number: 
8
1>create tree
2>pre order
3>In order
4>post order
enter choice
1
Enter number: 
4
1>create tree
2>pre order
3>In order
4>post order
enter choice
1
Enter number: 
7
1>create tree
2>pre order
3>In order
4>post order
enter choice
1
Enter number: 
3
1>create tree
2>pre order
3>In order
4>post order
enter choice
1
Enter number: 
45
1>create tree
2>pre order
3>In order
4>post order
enter choice
2
root->left->right
5 
4 
3 
8 
7 
45 
1>create tree
2>pre order
3>In order
4>post order
enter choice
4
left->right->root
3 
4 
7 
45 
8 
5 
1>create tree
2>pre order
3>In order
4>post order
enter choice
3
left->root->right
3 
4 
5 
7 
8 
45 
1>create tree
2>pre order
3>In order
4>post order
enter choice
1
Enter number: 
3
1>create tree
2>pre order
3>In order
4>post order
enter choice
2
root->left->right
5 
4 
3 
3 
8 
7 
45 
