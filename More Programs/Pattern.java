class Pattern
{
    public void display()
    {   for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(i+" ");
            for(int j=i;j<=5;j++)
                System.out.print((char)(i+64)+" ");
            System.out.println();    
        }
    }
}
        