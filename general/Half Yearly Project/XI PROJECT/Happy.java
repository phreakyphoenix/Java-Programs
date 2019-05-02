/**
 * The class Happy checks if a given number is a happy number or not.
 */

import java.io.*;
class Happy
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n;

    Happy()
    {
        n=0;
    }

    void getnum(int nn)
    {
        n=nn;
    }

    int sum_sq_digits(int x)
    {
        int s=0;
        while(x>0)
        {
            int d=x%10;
            s=s+d*d;
            x=x/10;
        }
        return s;
    }

    void isHappy()
    {
        int a=sum_sq_digits(n);
        while(a>9)
        {
            a=sum_sq_digits(a);
        }
        if(a==1)
            System.out.print(n+" is a Happy Number");
        else
            System.out.print(n+" is Not a Happy Number");
    }

    void main()throws IOException
    {
        Happy ob=new Happy();
        System.out.print("Enter any number: ");
        int b=Integer.parseInt(br.readLine());
        ob.getnum(b);  
        ob.isHappy();
    }
}