//A PROGRAM IMPLEMENTING CIRCULAR QUEUE OPERATION IN JAVA
import java.io.*;
class CircularQ
{
    int ar[];
    int front, rear, size;
    CircularQ(int s)
    {
        size=s;
        front=-1;
        rear=-1;
        ar=new int[size];
    }

    void push(int V)
    {
        if((rear-front)==size-1||rear+1==front)
            System.out.println("Circular Queue is full");
        else
        {
            if(rear==size-1)
                rear=0;
            else 
                rear++;
            ar[rear]=V;
            if(front==-1)
                front=0;
        }
    }

    int pop()
    {
        int p=0;
        if(front==-1&& rear==-1)
            return -999;
        else
        {
            p= ar[front];
            if(front==rear)
            {
                front=-1;
                rear=-1;
            }
            else if(front==size)
            {  
                front=0;
            }
            else
                front++;
            return p;
        }
    }

    void display()
    {
        if(front==-1&& rear==-1)
            System.out.println("Circular queue is empty");
        else
        {
            System.out.println("The circular queue:-");
            if(front<rear)
                for(int i=front;i<=rear;i++)
                    System.out.println(ar[i]);
            else
            {
                for(int i=front;i<size;i++)
                    System.out.println(ar[i]);
                for(int i=0;i<=rear;i++)
                    System.out.println(ar[i]);
            }
        }
    }

    void main()throws IOException
    {  
        BufferedReader xy = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter the size of CQ: ");
        int s=Integer.parseInt(xy.readLine());
        CircularQ obj=new  CircularQ(s);
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
                if(p==-999)
                    System.out.println("Array Empty");
                else
                    System.out.println("The popped number is"+p);
            }
            else if(n==3)
                obj.display();
            else if(n==4)
                System.out.println("Circular Queue terminated");    
        }
    }
}

OUTPUT
Enter the size of CQ: 
3
Enter 1:Push	 2:Pop	3:Display	4:Exit:
1
Enter the number to be pushed
1
Enter 1:Push	 2:Pop	3:Display	4:Exit:
1
Enter the number to be pushed
2
Enter 1:Push	 2:Pop	3:Display	4:Exit:
1
Enter the number to be pushed
3
Enter 1:Push	 2:Pop	3:Display	4:Exit:
1
Enter the number to be pushed
4
Circular Queue is full
Enter 1:Push	 2:Pop	3:Display	4:Exit:
2
The popped number is1
Enter 1:Push	 2:Pop	3:Display	4:Exit:
2
The popped number is2
Enter 1:Push	 2:Pop	3:Display	4:Exit:
2
The popped number is3
Enter 1:Push	 2:Pop	3:Display	4:Exit:
2
Array Empty
Enter 1:Push	 2:Pop	3:Display	4:Exit:
1
Enter the number to be pushed
2
Enter 1:Push	 2:Pop	3:Display	4:Exit:
1
Enter the number to be pushed
4
Enter 1:Push	 2:Pop	3:Display	4:Exit:
1
Enter the number to be pushed
6
Enter 1:Push	 2:Pop	3:Display	4:Exit:
3 
The circular queue:-
2
4
6
Enter 1:Push	 2:Pop	3:Display	4:Exit:
2
The popped number is2
Enter 1:Push  2:Pop	3:Display	4:Exit:
1
Enter the number to be pushed
8
Enter 1:Push	 2:Pop	3:Display	4:Exit:
3
The circular queue:-
4
6
8
Enter 1:Push	2:Pop	3:Display	4:Exit:
4
Cicular Queue terminated
