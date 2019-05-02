//Single linked Circular queue
import java.io.*;
class linkcq
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    node p,s,j;
    linkcq()
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
            s.nxt=s;
            j=s;
        }
        else
        {
            j.nxt=p;
            j=p;
            j.nxt=s;
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
            j.nxt=s;
        }
    }

    void output()
    {
        node x=s;
        do
        {
            System.out.println(x.n);
            x=x.nxt;
        }
        while(x!=s);
    }

    void main()throws IOException
    {        
        while(true)
        {
            System.out.println("1.push,\t 2.pop,\t 3.display,\t 4.exit");
            int c=Integer.parseInt(br.readLine());
            if(c==1)
                push();
            else if(c==2)
                pop();
            else if(c==3)
            {
                System.out.println("The Circular Queue is:");
                output();
            }
            else if(c==4)
            {
                System.out.println("Queue Terminated");
                break;
            }
            else
            {
                System.out.println("Wrong Choice");
                continue;
            }
        }
    }
}
OUTPUT:
1.push,	 2.pop,	 3.display,	 4.exit
1
Enter number
4
1.push,	 2.pop,	 3.display,	 4.exit
1
Enter number
5
1.push,	 2.pop,	 3.display,	 4.exit
1
Enter number
6
1.push,	 2.pop,	 3.display,	 4.exit
1
Enter number
8
1.push,	 2.pop,	 3.display,	 4.exit
2
4 has been popped.
1.push,	 2.pop,	 3.display,	 4.exit
2
5 has been popped.
1.push,	 2.pop,	 3.display,	 4.exit
3
The Circular Queue is:
6
8
1.push,	 2.pop,	 3.display,	 4.exit
4
Queue Terminated
