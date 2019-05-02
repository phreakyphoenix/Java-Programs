/**
 *WRITE A PROGRAM IMPLEMENTING STACK OPERATION IN JAVA
 */
import java.io.*; 
class Stack
{
    int ST[]; // Array to implement stack
    int size; // Maximum size of the stack
    int top; // Index of topmost element (Stack Pointer)
    Stack(int s) // Parameterised Constructor
    {
        size = s;
        ST = new int[size];
        top = -1; // Initialising top with -1
    }

    void push(int v) // Function to insert element in Stack
    {
        if(top == size-1) 
            System.out.println("Array Full");        
        else        
            ST[++top] = v;           
    }

    int pop() // Function to delete element from Stack
    {
        if(top == -1) 
            return -999;
        else
            return ST[top--];
    }

    void display()
    {
        if(top == -1)
            System.out.println("The stack is empty");
        else
        {
            System.out.println("The elements in the stack are : ");
            for(int i = 0; i<=top; i++)
                System.out.println(ST[i]);
        }
    }

    public void main()throws IOException
    {  
        BufferedReader xy = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter the size of stack: ");
        int s=Integer.parseInt(xy.readLine());
        Stack obj= new Stack(s);
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
                System.out.println("Stack terminated");    
        }
    }
}

/* OUTPUT:
Enter the size of stack: 
3
Enter 1:Push	 2:Pop	3:Display	4:Exit:
1
Enter the number to be pushed
5
Enter 1:Push	 2:Pop	3:Display	4:Exit:
2
The popped number is5
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
Enter 1:Push	 2:Pop	3:Display	4:Exit:
1
Enter the number to be pushed
2
Array Full
Enter 1:Push	 2:Pop	3:Display	4:Exit:
3
The elements in the stack are : 
2
3
4
Enter 1:Push	 2:Pop	3:Display	4:Exit:
2
The popped number is4
Enter 1:Push	 2:Pop	3:Display	4:Exit:
2
The popped number is3
Enter 1:Push	 2:Pop	3:Display	4:Exit:
2
The popped number is2
Enter 1:Push	 2:Pop	3:Display	4:Exit:
2
Array Empty
Enter 1:Push	 2:Pop	3:Display	4:Exit:
4
Stack terminated
 */