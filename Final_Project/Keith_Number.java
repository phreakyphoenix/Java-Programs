/*To check whether the given number is KEITH NUMBER or not.
A KEITH NUMBER is an integer with 'd' digits which generates a 
fibonacci series(in which each term in the sequence is the sum
of the 'd'previous terms)with the first 'd' terms being the 
decimal digits of the number,then the number itself occurs as a 
term in the sequence.
EXAMPLE:14,19,28,47,75,197,742,1104,1537 are some Keith numbers.
197 is a Keith Number since it generates the sequence
1,9,17,33,57,107,197,...                              */

import java.io.*;
class Keith_Number
{
    BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException
    {
        int c,copy,s=0;
        System.out.println("Enter a number");
        String a=x.readLine();
        c=a.length();
        int n=Integer.parseInt(a);
        copy=n;
        int ar[]=new int[c];
        while(n>0)
        {
            ar[--c]=n%10;
            n/=10;
        }//end of loop
        while(s<copy)
        {
            s=0;
            for(int j=0;j<ar.length;j++)
            {
                s=s+ar[j];              //sum of numbers
                if(j<ar.length-1)
                    ar[j]=ar[j+1];
                else
                    ar[j]=s;
            }//end of for loop
            //checking for Keith Number
            if(s>copy)     
            {
                System.out.println(copy+" is Not a KEITH NUMBER");
                break;
            }//end of if
            else if(s==copy)
            {
                System.out.println(copy+" is a KEITH NUMBER");
                break;
            }//end of else if
        }//end of while loop
    }//end of method
}//end of class
      
OUTPUT:
Enter a number
61
61 is a KEITH NUMBER

Enter a number
197
197 is a KEITH NUMBER

Enter a number
155
155 is Not a KEITH NUMBER


      