class series
{
    public static int fib(int n)
    {
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else if(n>2)
            return (fib(n-1)+fib(n-2));
        else 
            return -1;
    }
}