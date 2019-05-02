//This program checks for Smith number.

import java.io.*;
public class Smith
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));    
    private int sumdig(int n)// to find the sum of digts of a number
    {
        if(n==0)
            return 0;
        else
            return(n%10+sumdig(n/10));
    }    
    void main()throws IOException
    {
        System.out.println("Enter a number to check whether it is a Smith number or not:");
        int x=Integer.parseInt(xy.readLine());
        int sum=0,copy=x;
        for(int i=2;i<=x;)//to find the sum of the digits of repetitive prime factors of the number.
        {
            if(copy%i==0)
            {
                sum = sum+sumdig(i);
                x=x/i;
            }
            else
                i++;
        }
        if(sum==sumdig(copy))
            System.out.println(copy+" is a Smith number.");
        else
            System.out.println(copy+" is not a Smith number.");
    }//end of main method
}//end of class

OUTPUT:
Enter a number to check whether it is a Smith number or not:
666
666 is a Smith number.
