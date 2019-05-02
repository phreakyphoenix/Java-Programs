import java.io.*;
class twodig
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void check()throws IOException
    {
        System.out.println("Enter a Number");
        int n=Integer.parseInt(br.readLine());
        int c=0;
        for(int x=0;x<=9;x++)
        {
            
            while(n>0)
            {
                int d=n%10;
                if(d==x)
                 c++;
                n/=10;
            }
            
        }
        if(c==2)
        {
            System.out.println("The number contains two unique digits");
        }
        else
        {
            System.out.println("The number does not contain two unique digits only.");
        }
    }
}
/**
 * The Output is
 */