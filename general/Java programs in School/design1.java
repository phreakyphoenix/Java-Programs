/*
 1
 12
 123
 1234
 12345
 */
class design1
{
    void design1()
    {
        int i,j;
        char d='$';
        for(i=1;i<=5;i++)
        {
            System.out.print(d);
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(d);
        }
    }
}
