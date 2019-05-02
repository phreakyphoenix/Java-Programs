class disarium_2
{
    void main()
    {
        for(int i=1;i<=2000;i++)
        {
            int r,l=0;
            int copy=i;
            int n=i;
            double s=0;
            while(n!=0)
            {
                l++;
                n/=10;
            }
            while(copy!=0)
            {
                r=copy%10;
                copy=copy/10;
                s=s+Math.pow(r,l);
                l--;
            }
            if(s==i)
                System.out.println(i);          
        }
    }
}