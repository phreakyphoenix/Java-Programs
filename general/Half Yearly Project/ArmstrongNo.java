//This program checks whether a number is an Armstrong number or not.
import java.io.*;
public class ArmstrongNo
{
    private static int arm(int n)//recursive function
    {
        if(n==0)
            return 0;
        else
            return ((n%10)*(n%10)*(n%10)+arm(n/10));
    }
    static void main()throws IOException
    {
        BufferedReader xy= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a positive number: ");
        int n=Integer.parseInt(xy.readLine());
        if(arm(n)==n)
            System.out.println("It is an Armstrong number.");

        else 
            System.out.println("It is not an Armstrong number.");
    }//end of main
}//end of class

OUTPUT:
Enter a positive number: 
371
It is an Armstrong number.
