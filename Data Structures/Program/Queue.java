//WRITE A PROGRAM IMPLEMENTING QUEUE OPERATION IN JAVA
import java.io.*;
class Queue
{
    int ar[];
    int front, rear, size;
    Queue(int s)
    {
        size=s;
        front=0;
        rear=0;
        ar=new int[size];
    }

    void push(int v)
    {
        if(rear==size)
            System.out.println("Queue is full");
        else
        {
            ar[rear++]=v;
        }
    }

    int pop()
    {
        int d=-1;
        if(rear==front)
            System.out.println("Empty");
        else
        {
            d=ar[front++];
        }
        return d;
    }

    void display()
    {
        if(rear==front)
            System.out.println("queue is empty");
        else
        {
            System.out.println("The queue:-");
            for(int i=front;i<rear;i++)
                System.out.println(ar[i]);
        }
    }

    void main()throws IOException
    {  
        BufferedReader xy = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter the size of Queue: ");
        int s=Integer.parseInt(xy.readLine());
        Queue obj=new  Queue(s);
        int n=0;
        while(n!=4)
        {
            System.out.println("Enter 1:Push\t2:Pop\t3:Display\t4:Exit:");
            n=Integer.parseInt(xy.readLine());
            if (n==1)
            {
                System.out.println("Enter the number to be pushed");
                int v=Integer.parseInt(xy.readLine());
                obj.push(v);
            }
            else if(n==2)
            {
                int p=obj.pop();
                if(p!=-1)
                    System.out.println("The popped number is "+p);
                else
                    System.out.println("Empty");
            }
            else if(n==3)
                obj.display();
            else
                System.out.println(" Queue terminated");    
        }
    }
}