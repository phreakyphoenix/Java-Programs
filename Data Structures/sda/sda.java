//Single linked queue
import java.io.*;
class sda
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    node p,s,j;
    sda()
    {
        s=null;p=null;j=null;
    }

    void push(node p)throws IOException
    {
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

    void output()
    {
        node x;
        for(x=s;x!=null;x=x.nxt)
        {
            x.display();
        }
    }

    void main()throws IOException
    {        
        while(true)
        {
            System.out.println("1.push,\t 2.pop,\t 3.display,\t 4.exit");
            int c=Integer.parseInt(br.readLine());
            if(c==1)
                enter();
            else if(c==2)
                pop();
            else if(c==3)
            {
                System.out.println("The Queue is:");
                output();
            }
            else
            {
                System.out.println("Queue Terminated");
                break;
            }
        }
    }

    void enter()throws IOException
    {
        System.out.println("Enter the length of sda");
        int c=Integer.parseInt(br.readLine());
        int ar[]=new int [c];
        System.out.println("Enter the elements of sda");
        for(int i=0;i<c;i++)
            ar[i]=Integer.parseInt(br.readLine());
        for(int i=0;i<c;i++)
        {   
            node p=new node();
            p.n=ar[i];
            push(p);
        }
    }
}