//This program checks whether a number is prime or not
import java.io.*;
public class PrimeNo
{
    private static int prime(int n, int i)//recursive function
    {
        if(i>n/2)
            return 1;
        if(n%i==0)
            return 0;
        return (prime(n,i+1));
    }

    static void main()throws IOException
    {
        BufferedReader xy= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int n=Integer.parseInt(xy.readLine());
        int i=2;
        if(prime(n,i)==0)
            System.out.println("It is not a prime number.");
        else 
            System.out.println("It is a prime number.");
    }//end of main
}//end of class

OUTPUT:
Enter a number: 
11
It is a prime number.

