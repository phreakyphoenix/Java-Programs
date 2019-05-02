//Double linked queue
import java.io.*;
class dLinkQueue
{
    BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    node p,s,j;
    dLinkQueue()
    {
        s=null;p=null;j=null;
    }

    void push()throws IOException
    {
        p=new node();
        p.getdata();
        if(s==null)
        {
            s=p;
            p.nxt=null;
            j=p;
        }
        else
        {
            j.nxt=p;
            p.nxt=null;
            j=p;
        }
    }

    void pop()
    {
        if(s==null)
        {
            System.out.println("Empty queue");
        }
        else
        {
            System.out.println(s.n+" has been popped.");
            s=s.nxt;
        }
    }

    void disp()
    {
        for(node x=s;x!=null;x=x.nxt)
        {
            x.display();
        }
    }

    void main()throws IOException
    {        
        while(true)
        {
            System.out.println("1.push,\t 2.pop,\t 3.display,\t 4.exit");
            int c=Integer.parseInt(xy.readLine());
            if(c==1)
                push();
            else if(c==2)
                pop();
            else if(c==3)
            {
                System.out.println("The Queue is:");
                disp();
            }
            else
            {
                System.out.println("Queue Terminated");
                break;
            }
        }
    }
}
OUTPUT:
1.push,	 2.pop,	 3.display,	 4.exit
1
Enter number
6
1.push,	 2.pop,	 3.display,	 4.exit
1
Enter number
5
1.push,	 2.pop,	 3.display,	 4.exit
1
Enter number
9
1.push,	 2.pop,	 3.display,	 4.exit
2
6 has been popped.
1.push,	 2.pop,	 3.display,	 4.exit
3
The Queue is:
5
9
1.push,	 2.pop,	 3.display,	 4.exit
1
Enter number
4
1.push,	 2.pop,	 3.display,	 4.exit
3
The Queue is:
5
9
4
1.push,	 2.pop,	 3.display,	 4.exit
4
Queue Terminated