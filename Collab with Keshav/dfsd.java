class dfsd
{
    void dfsd()
    {
        int x= 97;char ch;
        do
        {
            ch = (char)x;
            System.out.print(ch+" ");
            if (x%10==0)
            break;
            ++x;
        }while(x<=100);
    }
}
