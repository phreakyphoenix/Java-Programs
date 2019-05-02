class rtn
{
    int a,b;
    void accept(int x, int y)
    {
        a=x;
        b=y;
    }
    private int calc()
    {
        return a+b;
    }
    void display(int p, int q)
    {
        int c = calc();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}