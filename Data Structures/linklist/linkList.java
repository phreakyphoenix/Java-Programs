//A link list in which user can push, pop and display from both ends.
import java.io.*;
class linkList
{
    BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    node p,s,j;
    linkList()
    {
        s=null;p=null;j=null;
    }

    void push1(node p)throws IOException                    //from front
    {
        if(s==null)
        {
            s=p;
            p.prv=null;
            p.nxt=null;
        }
        else
        {
            s.prv=p;
            p.nxt=s;p.prv=null;
            s=p;
        }
    }

    void push2(node p)throws IOException                    //from rear
    {
        if(s==null)
        {
            s=p;
            p.prv=null;
            p.nxt=null;
            j=p;
        }
        else
        {
            j.nxt=p;
            p.prv=j;
            p.nxt=null;
            j=p;
        }
    }

    void pop1()                                             //from front
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

    void pop2()                                             //from rear
    {
        if(s==null)
        {
            System.out.println("Empty queue");
        }
        else
        {
            System.out.println(j.n+" has been popped.");
            j=j.prv;
        }
    }

    void disp1()
    {
        if(s==null)
        {
            System.out.println("Empty queue");
        }
        else
            for(node x=s;x!=null;x=x.nxt)
            {
                x.display();
            }
    }

    void disp2()
    {
        if(s==null)
        {
            System.out.println("Empty queue");
        }
        else
            for(node x=j;x!=null;x=x.prv)
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
            {
                System.out.println("Enter 1 to push from the front:");
                System.out.println("Enter 2 to push from the rear:");
                int x= Integer.parseInt(xy.readLine());
                node p=new node();
                p.getdata();
                if(x==1)
                    push1(p);
                else if(x==2)
                    push2(p);
                else
                {
                    System.out.println("Wrong input");
                    continue;
                }
            }
            else if(c==2)
            {
                System.out.println("Enter 1 to pop from the front:");
                System.out.println("Enter 2 to pop from the rear:");
                int x= Integer.parseInt(xy.readLine());
                if(x==1)
                    pop1();
                else if(x==2)
                    pop2();
                else
                {
                    System.out.println("Wrong input");
                    continue;
                }
            }
            else if(c==3)
            {
                System.out.println("Enter 1 to display from the front:");
                System.out.println("Enter 2 to display from the rear:");
                int x= Integer.parseInt(xy.readLine());
                if(x==1)
                    disp1();
                else if(x==2)
                    disp2();
                else
                {
                    System.out.println("Wrong input");
                    continue;
                }
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
1.push,  2.pop,  3.display,  4.exit
1
Enter 1 to push from the front:
Enter 2 to push from the rear:
2
Enter number
1
1.push,  2.pop,  3.display,  4.exit
1
Enter 1 to push from the front:
Enter 2 to push from the rear:
2
Enter number
3
1.push,  2.pop,  3.display,  4.exit
1
Enter 1 to push from the front:
Enter 2 to push from the rear:
2
Enter number
4
1.push,  2.pop,  3.display,  4.exit
2
Enter 1 to pop from the front:
Enter 2 to pop from the rear:
2
4 has been popped.
1.push,  2.pop,  3.display,  4.exit
2
Enter 1 to pop from the front:
Enter 2 to pop from the rear:
2
3 has been popped.
1.push,  2.pop,  3.display,  4.exit
2
Enter 1 to pop from the front:
Enter 2 to pop from the rear:
1
1 has been popped.
1.push,  2.pop,  3.display,  4.exit
3
Enter 1 to display from the front:
Enter 2 to display from the rear:
1
3
4
1.push,  2.pop,  3.display,  4.exit
3
Enter 1 to display from the front:
Enter 2 to display from the rear:
2
1
1.push,  2.pop,  3.display,  4.exit
4
Queue Terminated