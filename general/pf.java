import java.util.Scanner;
class pf
{
    public static void main()
    {
        System.out.print("Enter numbers whose prime factors are to be shown: ");
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int div=2;
        int pow=0;
        while(true)
        {
            if(n%div==0)
            {
                n/=div;
                pow++;
            }
            else
            {
                if(pow>0)
                {
                    if (pow==1)System.out.println(div);
                    else System.out.println(div+ " ** "+pow);
                }
                if(n==1)return;
                div++;
                pow=0;
            }
        }
    }
}