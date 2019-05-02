//This program checks for Kaprekar number.

import java.io.*;
class Kaprekar
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    void check()throws IOException
    {
        System.out.println("Enter a number to check whether it is a Kaprekar number or not:");
        int n=Integer.parseInt(xy.readLine());
        String str=Integer.toString(n*n);
        int l = str.length();
        int sum=Integer.parseInt(str.substring(0,l/2))+Integer.parseInt(str.substring(l/2));
        if(n==sum)
            System.out.println(n+" is a kaprekar number.");
        else
            System.out.println(n+" is a not kaprekar number.");
    }
}
OUTPUT:
Enter a number to check whether it is a Kaprekar number or not:
297
297 is a kaprekar number.
