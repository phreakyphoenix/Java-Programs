class factorial
{
    int a;
    factorial(int m)
    {
        a=m;
    }
    private void display()
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
        System.out.println(f);
    }
    void man()
    {
        factorial obj= new factorial(a);
        obj.display();
    }
}
