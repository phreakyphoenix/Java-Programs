class numberpali
{
    private void ma(int n)
    {
        int r=0,op=0,c=n;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            op=op*10+r;
        }
        if(c==op)
        System.out.println("yes");
        else
        System.out.println("no");
    }
    void main(int n)
    {
        numberpali ob = new numberpali();
        ob.ma(n);
    }
}
