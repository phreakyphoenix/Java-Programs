// 1/2, 2/3. 3/4, ...  , 19/20.

class fraction
{
    void display()
    {
        double i;
        for(i=1;i<=19;i++)
        {
            System.out.println(i/(i+1));
        }
     }
}