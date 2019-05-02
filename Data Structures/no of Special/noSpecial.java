//This program checks he number of Special numbers in a queue.
import java.io.*;
class noSpecial
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    node p,s,j;int f;
    noSpecial()
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

    boolean isSpecial(int n)
    {
        int c=n,s=0,f; 
        while(n!=0)
        {
            int r=n%10;
            n=n/10;
            f=1;
            for(int i=2;i<=r;i++)
                f=f*i;
            s=s+f;
        }
        if (s==c)
            return true;
        return false;
    }

    int noOfSpecial()
    {
        f=0;
        for(node x=s;x!=null;x=x.nxt)
        {
            if(isSpecial(x.n))
                f++;
        }
        return f;
    }

    void main()throws IOException
    {        
        while(true)
        {
            System.out.println("1.push,\t 2.pop,\t 3.display,\t 4.To count the number of Special numbers,\t 5.exit");
            int c=Integer.parseInt(br.readLine());
            if(c==1)
                push();
            else if(c==2)
                pop();
            else if(c==3)
            {
                System.out.println("The Queue is:");
                disp();
            }
            else if(c==4)
            {
                f=0;
                System.out.println("The no of Special Numbers is:"+noOfSpecial());                
            }
            else if(c==5)
            {
                System.out.println("Queue Terminated");
                break;
            }
            else
                continue;
        }
    }
}
OUTPUT:
1.push,	 2.pop,	 3.display,	 4.To count the number of Special numbers,	 5.exit
1
Enter number
1
1.push,	 2.pop,	 3.display,	 4.To count the number of Special numbers,	 5.exit
1
Enter number
2
1.push,	 2.pop,	 3.display,	 4.To count the number of Special numbers,	 5.exit
1
Enter number
145
1.push,	 2.pop,	 3.display,	 4.To count the number of Special numbers,	 5.exit
3
The Queue is:
1
2
145
1.push,	 2.pop,	 3.display,	 4.To count the number of Special numbers,	 5.exit
4
The no of Special Numbers is:3
1.push,	 2.pop,	 3.display,	 4.To count the number of Special numbers,	 5.exit
5
Queue Terminated