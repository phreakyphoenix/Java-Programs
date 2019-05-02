//This program searches for a number in a single linked Queue.
import java.io.*;
class searchnum
{
    BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    node p,s,j;
    searchnum()
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

    boolean check(int i)
    {
        for(node x=s;x!=null;x=x.nxt)
        {
            if(x.n==i)
                return true;
        }
        return false;
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
                System.out.print("Enter a number for checking:");
                int x= Integer.parseInt(xy.readLine());
                if(check(x))
                    System.out.println(x+" is present");
                else
                    System.out.println(x+" is not present");
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
Enter a number for checking:1
1 is present
1.push,	 2.pop,	 3.display,	 4.To check if a number is present,	 5.exit
2
1 has been popped.
1.push,	 2.pop,	 3.display,	 4.To check if a number is present,	 5.exit
4
Enter a number for checking:1
1 is not present
1.push,	 2.pop,	 3.display,	 4.To check if a number is present,	 5.exit
5
Queue Terminated