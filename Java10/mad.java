class mad
{
    void main(int x, int n)
    {
        int i;
        double s=0;
        for(i=1;i<=n;i++)
        {
            int b=3*i-1;
            double c= Math.pow(x,b);
            double no=Math.pow(2,i);
            int f=1;
            for(int m=1;m<=no;m++)
            {
                f=f*m;
            }
            s=s+(c/f);
        }
        System.out.println(s);       
    }
}
