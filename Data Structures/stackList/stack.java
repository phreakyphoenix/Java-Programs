//Single linked stack
import java.io.*;
class stack
{
    node p,s;
    stack()
    {
        p=null;
        s=null;
    }

    void push() throws IOException
    {
        p = new node();
        p.input();
        if(s==null)
        {
            s=p;
            p.prv=null;
        }
        else
        {
            p.prv = s;
            s=p;
        }
    }

    void pop()
    {
        if (s==null)
            System.out.println("Stack empty.");
        else
        {
            System.out.println(s.n +" has been popped.");
            s=s.prv;
        }
    }
    
    void display()
    {
        node x;
        for(x=s;x!=null;x=x.prv)
        {
            x.display();
        }
    }
    
    void main()throws IOException
    {        
        while(true)
        {
            BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1.push,\t 2.pop,\t 3.display,\t 4.exit");
            int c=Integer.parseInt(xy.readLine());
            if(c==1)
                push();
            else if(c==2)
                pop();
            else if(c==3)
            {
                System.out.println("The Stack is:");
                display();
            }
            else
            {
                System.out.println("Satck Terminated");
                break;
            }
        }
    }
}

OUTPUT:
1.push,	 2.pop,	 3.display,	 4.exit
1
Enter number
3
1.push,	 2.pop,	 3.display,	 4.exit
1
Enter number
4
1.push,	 2.pop,	 3.display,	 4.exit
1
Enter number
5
1.push,	 2.pop,	 3.display,	 4.exit
2
5 has been popped.
1.push,	 2.pop,	 3.display,	 4.exit
1
Enter number
6
1.push,	 2.pop,	 3.display,	 4.exit
1
Enter number
7
1.push,	 2.pop,	 3.display,	 4.exit
2
7 has been popped.
1.push,	 2.pop,	 3.display,	 4.exit
3
The Stack is:
6
4
3
1.push,	 2.pop,	 3.display,	 4.exit
4
Satck Terminated