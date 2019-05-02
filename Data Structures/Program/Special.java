//This program checks for Special Number.
import java.io.*;
class Special
{
    BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    boolean isSpecial(int n)
    {
        int c=n,s=0,f; 
        while(n!=0)
        {
            int r=n%10;
            n=n/10;
            f=1;
            for(int i=2;i<=r;i++)
                f=f*i;
            s=s+f;
        }
        if (s==c)
            return true;
        return false;
    }

    void main()throws IOException
    {
        System.out.println("Enter a number:");
        int n=Integer.parseInt(xy.readLine());
        if(isSpecial(n))
            System.out.println(n+" is a Special Number.");
        else
            System.out.println(n+" is not a Special Number.");
    }
}