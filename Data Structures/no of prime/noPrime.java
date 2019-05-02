/This program checks the number of prime numbers in a Queue.
import java.io.*;
class noPrime
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    node p,s,j;int f;
    noPrime()
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

    boolean prime(int n)
    {
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                return false;
        return true;
    }
    
    int noOfPrime()
    {
        f=0;
        for(node x=s;x!=null;x=x.nxt)
        {
            if(prime(x.n))
            f++;
        }
        return f;
    }

    void main()throws IOException
    {        
        while(true)
        {
            System.out.println("1.push,\t 2.pop,\t 3.display,\t 4.To count the number of primes,\t 5.exit");
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
                System.out.println("The no of Primes is:"+noOfPrime());                
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
1.push,	 2.pop,	 3.display,	 4.To count the number of primes,	 5.exit
1
Enter number
6
1.push,	 2.pop,	 3.display,	 4.To count the number of primes,	 5.exit
1
Enter number
2
1.push,	 2.pop,	 3.display,	 4.To count the number of primes,	 5.exit
1
Enter number
11
1.push,	 2.pop,	 3.display,	 4.To count the number of primes,	 5.exit
1
Enter number
47
1.push,	 2.pop,	 3.display,	 4.To count the number of primes,	 5.exit
2
6 has been popped.
1.push,	 2.pop,	 3.display,	 4.To count the number of primes,	 5.exit
4
The no of Primes is :3
1.push,	 2.pop,	 3.display,	 4.To count the number of primes,	 5.exit
5
Queue Terminated