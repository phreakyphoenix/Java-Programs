import java.io.*;
class kaprekar
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException
    {
        System.out.println("Enter a Number");
        int n=Integer.parseInt(br.readLine());
        int cp=n;int cnt=0;int cp2=cp;
        while(cp>0)
        {
            cnt++;
            cp/=10;
        }
        int fp=0,lp=0;
        fp=(cp2*cp2)/((int)Math.pow(10,cnt));
        lp=(cp2*cp2)%((int)Math.pow(10,cnt));
        int newno=fp+lp;
        if(newno==n)
            System.out.println(newno + " is a Kaprekar Number");
        else
            System.out.println(newno + " is a not Kaprekar Number");
    }
}
/**
 * The Output is
 */
    