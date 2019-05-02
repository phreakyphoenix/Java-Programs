//This program checks for Automorphic number.

import java.io.*;
class Automorphic
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    void check()throws IOException
    {
        System.out.println("Enter a number to check whether it is a Automorphic number or not:");
        int n=Integer.parseInt(xy.readLine());
        int c=n;
        int k=0;
        while(c>0)
        {
            int m=c%10;
            c=c/10;
            k++;
        }
        int s=n*n;
        int r=s%(int)(Math.pow(10,k));
        if(r==n)
            System.out.println(n+" is an Automorphic number.");
        else
            System.out.println(n+" is not an not an Automorphic number.");
    }
}//end of class

OUTPUT:
Enter a number to check whether it is a Automorphic number or not:
25
25 is an Automorphic number.
