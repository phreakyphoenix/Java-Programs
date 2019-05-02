//This programs checks for the validity of an ISBN code.
import java.util.*;
class isbn
{ 
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an ISBN code: ");
        String n=sc.nextLine();
        int l=n.length();
        int s=0,x=10;
        if(l==10)
        {
            for(int i=0;i<9;i++)
            {
                int c=(int)n.charAt(i)-48;
                s=s+c*x;
                x--;
            }
            char lc=n.charAt(9);
            if(lc=='X')
                s=s+10;
            else
                s=s+(lc-48);
            int r=s%11;
            if(r==0)
                System.out.println("Sum= "+s+"\nValid ISBN code.");
            else
                System.out.println("Sum= "+s+"\nInvalid ISBN code.");

        }
        else
            System.out.println("Invalid Input.");
    }
}

OUTPUT:
Enter an ISBN code: 
0201103311
Sum= 55
Valid ISBN code.
  