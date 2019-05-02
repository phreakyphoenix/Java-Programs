//This program accepts a number and check whether it is a Happy number or not.

import java.io.*;
class Happy_no
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    private void check(int n) // recursive method.
    {
        int s=0;
        while(n>0)// finds sum of squares of digits of a number.
        {
            int r=n%10;
            n=n/10;
            s=s+r*r;
        }
        if(s==1)
            System.out.print(" is a Happy number.");
        else if(s<=9)
            System.out.print( " is not a Happy number.");
        else 
            check(s);          
    }
    public void main()throws IOException
    {
        System.out.println("Enter a Number: ");
        int n=Integer.parseInt(xy.readLine());
        System.out.print(n);
        Happy_no obj= new Happy_no();
        check(n);
    }
}//end of class

OUTPUT:
Enter a Number: 
998
998 is a Happy number.
