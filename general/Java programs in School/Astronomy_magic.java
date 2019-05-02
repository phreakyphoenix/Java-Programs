class Astronomy_magic
{
    void displaysum(int n)
    {
        int s=0;
        while(n!=0)
        {
            int a=n % 10;
            n = n/10;
            s = s+a;
        }
        int n2=s;
        s=0;
        while(n2!=0)
        {
            int a=n2 % 10;
            n2 = n2/10;
            s = s+a;
        }
        System.out.println (s);   
    }    
}

