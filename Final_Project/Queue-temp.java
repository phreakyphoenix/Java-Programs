/**
 * WRITE A PROGRAM IMPLEMENTING CIRCULAR QUEUE OPERATION IN JAVA
 */


import java.io.*;
class Queue
{
    int ar[];
    int front, rear, size;
    Queue(int s)
    {
        size=s;
        front=0;
        rear=-1;
        ar=new int[size];
    }

    void push(int v)
    {
        if(rear==size-1)
            System.out.println("Queue is full");
        else
        {
            ar[++rear]=v;
        }
    }

    int pop()
    {
        int p=0;
        if(front >rear)
            return -999;
        else
        {
            p=ar[front];
            for(int i=front;i<rear;i++)
               ar[i]=ar[i+1];
            rear--;
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
                if(p==-999)
                    System.out.println("Array Empty");
                else
                    System.out.println("The popped number is"+p);
            }
            else if(n==3)
                obj.display();
            else
                System.out.println(" Queue terminated");    
        }
    }
}


/**OUTPUT
 * Enter the size of Queue: 
   3
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
   1
   Enter the number to be pushed
   8
   Queue is full
   Enter 1:Push	 2:Pop	3:Display	4:Exit:
   3
   The circular queue:-
   2
   4
   6
   Enter 1:Push	 2:Pop	3:Display	4:Exit:
   2
   The popped number is2
   Enter 1:Push	 2:Pop	3:Display	4:Exit:
   2
   The popped number is4
   Enter 1:Push	 2:Pop	3:Display	4:Exit:
   3
   The circular queue:-
   6
   Enter 1:Push	 2:Pop	3:Display	4:Exit:
   4
*/


/**
 * NAME     TYPE      DESCRIPTON
 * ST[]     int   -   to store numbers
 * size     int   -   to store size of array
 * front    int   -   to store the index of array for popped value
 * rear     int   -   to store the index of array for entered value
 * s        int   -   to store size of array in main method
 * v        int   -   to store a number from user
 * i        int   -   loop variable for displaying and shifting
 * n        int   -   to store user's choice
 * p        int   -   to store popped value
 */

