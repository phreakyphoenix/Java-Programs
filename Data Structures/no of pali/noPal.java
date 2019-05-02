//This program checks he number of palindromes in a queue.
import java.io.*;
class noPal
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    node p,s,j;int f;
    noPal()
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

    boolean pal(int n)
    {
        String w=Integer.toString(n);
        if(w.equalsIgnoreCase(new StringBuffer(w).reverse().toString()))
            return true;
        return false;
    }

    int noOfPal()
    {
        f=0;
        for(node x=s;x!=null;x=x.nxt)
        {
            if(pal(x.n))
                f++;
        }
        return f;
    }

    void main()throws IOException
    {        
        while(true)
        {
            System.out.println("1.push,\t 2.pop,\t 3.display,\t 4.To count the number of palindromes,\t 5.exit");
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
                System.out.println("The no of Palindromes is :"+noOfPal());                
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
1.push,	 2.pop,	 3.display,	 4.To count the number of palindromes,	 5.exit
1
Enter number
1
1.push,	 2.pop,	 3.display,	 4.To count the number of palindromes,	 5.exit
1
Enter number
48
1.push,	 2.pop,	 3.display,	 4.To count the number of palindromes,	 5.exit
1
Enter number
363
1.push,	 2.pop,	 3.display,	 4.To count the number of palindromes,	 5.exit
1
Enter number
24042
1.push,	 2.pop,	 3.display,	 4.To count the number of palindromes,	 5.exit
1
Enter number
5
1.push,	 2.pop,	 3.display,	 4.To count the number of palindromes,	 5.exit
2
1 has been popped.
1.push,	 2.pop,	 3.display,	 4.To count the number of palindromes,	 5.exit
3
The Queue is:
48
363
24042
5
1.push,	 2.pop,	 3.display,	 4.To count the number of palindromes,	 5.exit
4
The no of Palindromes is :3
1.push,	 2.pop,	 3.display,	 4.To count the number of palindromes,	 5.exit
5
Queue Terminated