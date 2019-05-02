//This program checks whether a number is a two digit number or not.

import java.io.*;
class twoDigit
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    void twoDigit()throws IOException
    {
        System.out.println("Enter a number to check whether it is a two digit number or not:");
        int n= Integer.parseInt(xy.readLine());
        int r,t=0;
        for(int x=0;x<=9;x++)//finds frequency of each digit in number.
        {
            int v=n,c=0;
            while(v>0)
            {
                r=v%10;
                v=v/10;
                if(r==x)
                    c++;
            }
            if(c>0)
                t++;
        }
        if(t==2)
            System.out.println(n+" is a two digit number.");
        else
            System.out.println(n+" is not a two digit number.");
    }
}//end of class

OUTPUT:
Enter a number to check whether it is a two digit number or not:
55656
55656 is a two digit number.
