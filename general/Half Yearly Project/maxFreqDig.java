//This program displays the highest frequent digit in a number.

import java.io.*;
class maxFreqDig
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void countDig()throws IOException
    {
        System.out.println("Enter a number to display highest frequent digit: ");
        int n=Integer.parseInt(br.readLine());
        int max=0,hfd=0,r=0;
        for(int x=0;x<=9;x++)
        {
            int c=0;
            int v=n;
            while(v>0)
            {
                r=v%10;
                v=v/10;
                if(x==r)
                    c++;                
            }
            if(c>max)//to store digit with max frequency.
            { 
                max=c;hfd=x;
            }
        }
        System.out.println("Highest frequency digit is " +hfd);
    }
}//end of class

OUTPUT:
Enter a number to display highest frequent digit: 
5566656
Highest frequency digit is 6
