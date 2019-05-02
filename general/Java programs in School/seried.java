class seried
{
    void display(int n)
    {
        int i;
        double s=0;
        for(i=1;i<=n;i++)
        {
            s=s+Math.pow(i,i);                   
        }
        System.out.println("Sum Is "+s);
    }
}
