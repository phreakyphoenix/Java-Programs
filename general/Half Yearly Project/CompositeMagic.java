/* A composite magic number is an integer which is both composite and magic.
 * This program dispalys all the composite magic numbers lying between m and n, both inclusive.
 */

import java.io.*;
class CompositeMagic
{  
        private boolean isComposite(int n) // Checks for Composite number
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count>2)
            return true;
        else
            return false;
    }

    private int sumDig(int n) // returns sum of digits of a number
    {
        if(n==0)
            return 0;
        else
            return(n%10+sumDig(n/10));
    }    

    private boolean isMagic(int n) // Checks for Magic number
    {
        int a = sumDig(n);
        while(a>9)
        {
            a = sumDig(a);
        }

        if(a == 1)
            return true;
        else
            return false;
    }
    
    public void main()throws IOException
    {
        CompositeMagic ob = new CompositeMagic();
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter the lower limit (must be a positive integer) : ");
        int m=Integer.parseInt(br.readLine());
        System.out.print("Enter the upper limit (must be a positive integer) : ");
        int n=Integer.parseInt(br.readLine());
        
        if (m<n)
        {
            System.out.println("The Composite Magic Integers in the given range are: ");
            for(int i=m; i<=n; i++)
            {
                if(ob.isComposite(i)==true && ob.isMagic(i)==true)
                {
                    System.out.println(i);
                }
            }
        }
        
        else
            System.out.println("OUT OF RANGE");
    }//end of main method
}//end of class

OUTPUT:
Enter the lower limit (must be a positive integer) : 50
Enter the upper limit (must be a positive integer) : 100
The Composite Magic Integers in the given range are: 
55
64
82
91
100
