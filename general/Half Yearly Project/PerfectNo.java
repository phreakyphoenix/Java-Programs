//This program checks whether a number is an Perfect number or not.
import java.io.*;
public class PerfectNo
{
    static int s=0;
    private static int perfect(int n, int i)//recursive function
    {
        if(i>n/2)
            return s;
        if(n%i==0)
            s=s+i;
        return (perfect(n,i+1));
    }

    static void main()throws IOException
    {
        BufferedReader xy= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a positive number: ");
        int n=Integer.parseInt(xy.readLine());
        int i=1;
        if(n>0)
        {
            if(perfect(n,i)==n)
                System.out.println("It is a perfect number.");

            else 
                System.out.println("It is not a perfect number.");
        }
    }//end of method
}//end of class

OUTPUT:
Enter a positive number: 
6
It is a perfect number.
