class des_nine_ten
{
    void main()
    {
        int i,b,x=0,j,c,y=8;
        for(i=1;i<=5;i++)
        {
            for(b=1;b<=x;b++)
            {
                System.out.print(" ");
            }
            x++;
            System.out.print("*");
            for(j=1;j<=3;j++)
            {
                System.out.print(i);
            }
            for(c=1;c<=y;c++)
            {
                System.out.print(" ");
            }
            y=y-2;
            for(j=1;j<=3;j++)
            {
                System.out.print(i);
            }
            System.out.print("*");        
            System.out.println();
        }
    }   
}
