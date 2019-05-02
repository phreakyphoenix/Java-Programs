class two_digit
{
    void check(int n)
    {
        int c=n,r,d,m=0;
        int f=n%10;
        int g=f;
        while (n!=0)
        {
            r=n%10;
            n=n/10;
            if(r!=f)
            {
                g=r;
                break;
            }
        }
        while (c!=0)
        {
            d=c%10;
            c=c/10;
            if(d!=f&&d!=g)
            {
                m=1;
                break;
            }
        }
        if(m==0)
        {
            System.out.println("It is a two-digit no.");
        }
        else
        {
            System.out.println("It is not a two-digit no.");
        }
    }
}
