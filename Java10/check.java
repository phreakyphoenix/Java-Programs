class check
{
    void main(int n)
    {
        int i,r,s=0,c;
        System.out.println("All Armstrong Numbers before "+n+" are:");
        for(i=1;i<=n;i++)
        {
            c=i;
            s=0;
            while(i!=0)
            {                
                r=i%10;
                i=i/10;
                s=s+(r*r*r);
            }
            if(s==c)
            {
                System.out.println(s);                
            }
        }
    }
}
