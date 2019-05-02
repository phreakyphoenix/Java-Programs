class test
{
    int max(int v)
    {
        if(v==0)
        return 0;
        return((int)Math.max((v%10),max(v/10)));
    }
}