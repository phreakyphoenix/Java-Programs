import java.io.*;
class Special
{
       BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
       int no,r,f=1,x=0;
       int sno(int n)
       {   
            int c=n;
            while(n!=0)
            {
                r=n%10;
                n=n/10;
                f=f*r;
                x=x+r;
            }
            no=f+x;
            if(c==no)
            return 1;
            else
            return 0;
       }
       void display() throws IOException
       {
           System.out.println("Please enter a number");
           int p = Integer.parseInt(xy.readLine());
           System.out.println(sno(p));
       }        
}    

