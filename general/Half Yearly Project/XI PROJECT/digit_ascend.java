import java.io.*;
class digit_ascend
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //function for printing the digits of a number in ascending order
    void dig_ascend()throws IOException
    {
        System.out.println("Enter a Number. . . ");
        int n=Integer.parseInt(br.readLine());
        System.out.println("The digits in ascending order are");
        for(int i=0;i<=9;i++)
        {
            int c=n;
            while(c>0)
            {
                int d=c%10;
                if(i==d)
                    System.out.println(d);
                c=c/10;
            }
        }
    }
}
/**
 * The Output is
 */