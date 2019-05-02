import java.util.Scanner;
class stat
{
    Scanner in=new Scanner(System.in);
    int a[]=new int[10];
    double m,sd;
    public stat()
    {
        System.out.println("Enter 10 numbers: ");
        for(int i=0;i<10;i++)
            a[i]=in.nextInt();
        m=0.0;
        sd=0.0;
    }
    public double mean()
    {
        int s=0;
        for(int i=0;i<10;i++)
            s=s+a[i];
        m=s/10.0;
        return m;
    }
    public void dev()
    {
        for(int i=0;i<10;i++)
        {
            m=mean();
            sd=m-a[i];
            System.out.println("The deviation from mean of "+a[i]+" is: "+sd);
        }
    }
}
    