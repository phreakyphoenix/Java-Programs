class pascal
{
    void triangle(int n)
    {
        int a[]=new int[n*2-1];
        System.out.println("The Pascal's Triangle of " +n+ " rows is: ");
        for(int i=1;i<=n;i++)
        {
            for(int j=n+2-i;j<n+i-3;j++)
            {
                if(a[j-1]!=0&&a[j+1]!=0)
                    a[j]=a[j-1]+a[j+1];
            }

            for(int j=n+1-i;j<n+i-2;j++)
            {
                if(n%2==0)
                {
                    if((i%2==0&&j%2!=0)||(i%2!=0&&j%2==0))
                        a[j]=0;
                }
                else
                {
                    if((i%2==0&&j%2==0)||(i%2!=0&&j%2!=0))
                        a[j]=0;
                }
            }
            a[n-i]=1;
            a[n+i-2]=1;
            for(int j=0;j<a.length;j++)
            {
                if(a[j]!=0)
                    System.out.print(a[j]+"\t");
                else
                    System.out.print(" \t");
            }
            System.out.println();
        }
    }
}