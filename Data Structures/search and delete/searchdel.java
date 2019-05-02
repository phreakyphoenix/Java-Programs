//This program searches for a number in a single linked Queue, and deletes it if present.
import java.io.*;
class searchdel
{
    BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    node p,s,j;boolean f=false;
    searchdel()
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

    void del(int i)
    {
        if(s.n==i)
        {
            s=s.nxt;
            f=true;
        }
        else 
        {
            for(node x=s;x.nxt!=null;x=x.nxt)
            {
                if(x.nxt.n==i)
                {
                    x.nxt=x.nxt.nxt;
                    f=true;
                    break;
                }
            }
        }
    }

    void main()throws IOException
    {        
        while(true)
        {
            System.out.println("1.push,\t 2.pop,\t 3.display,\t 4.To check if a number is present,\t 5.exit");
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
            else if(c==4)
            {
                f=false;
                System.out.print("Enter a number for checking:");
                int x= Integer.parseInt(xy.readLine());
                del(x);
                if(f==true)
                    System.out.println(x+" has been found and deleted.");
                else
                    System.out.println(x+" does not exist.");
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
1.push,	 2.pop,	 3.display,	 4.To check if a number is present,	 5.exit
1
Enter number
1
1.push,	 2.pop,	 3.display,	 4.To check if a number is present,	 5.exit
1
Enter number
2
1.push,	 2.pop,	 3.display,	 4.To check if a number is present,	 5.exit
1
Enter number
3
1.push,	 2.pop,	 3.display,	 4.To check if a number is present,	 5.exit
1
Enter number
4
1.push,	 2.pop,	 3.display,	 4.To check if a number is present,	 5.exit
1
Enter number
5
1.push,	 2.pop,	 3.display,	 4.To check if a number is present,	 5.exit
4
Enter a number for checking:3
3 has been found and deleted.
1.push,	 2.pop,	 3.display,	 4.To check if a number is present,	 5.exit
3
The Queue is:
1
2
4
5
1.push,	 2.pop,	 3.display,	 4.To check if a number is present,	 5.exit
5
Queue Terminated
