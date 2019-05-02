import java.io.*;
class prime_factor
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void factor()throws IOException
    {
        System.out.println("enter a number");
        int n=Integer.parseInt(br.readLine());
        int c=n;
        int f=2;
        System.out.println("The prime factors of " +n +" are-");
        while(c>0)
        {
            if(c%f==0)
            {    
                System.out.println(f);
                c=c/f;
            }
            else
            {
                f++;
            }
        }
    }
}
/**
 * The Output is
 */
        