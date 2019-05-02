//This rogram accepts a number and display the digits in ascending order.

import java.io.*;
class digits_ascend
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    void dispaly()throws IOException
    {
        System.out.println("Enter a number, its digits will be dispalyed in ascending order:");
        int n= Integer.parseInt(xy.readLine());
        int r,t=0;
        for(int x=0;x<=9;x++)//prints digits in ascending order.
        {
            int v=n;
            while(v>0)
            {
                r=v%10;
                v=v/10;
                if(r==x)
                    System.out.println(x);;
            }
        }
    }//end of display method
}//end of class

OUTPUT:
Enter a number, its digits will be dispalyed in ascending order:
567748
4
5
6
7
7
8
