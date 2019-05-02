class pf
{
    int pc(int num)
    {
        int n=2;
        while(true)
        {

            if(num%n==0)
                return n;

            else
                n++;
        }
    }

    void main(int n)
    {
        int fac=pc(n);
        System.out.println("Facs are: " +fac+", "+(n/fac));
    }

}

    