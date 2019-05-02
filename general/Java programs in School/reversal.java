class reversal
{
    void main(int n)
    {
        int r,op=0;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            op=op*10+r;
        }
        System.out.println(op);
    }
}
