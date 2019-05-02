import java.io.*;
class even_or_odd
{
    BufferedReader xy= new BufferedReader(new InputStreamReader(System.in));
    int a[]=new int[20];
    int b[]=new int[20];
    int c[]=new int[20];
    int x,y=0;
    void check()throws IOException
    {
        for(int i=0;i<20;i++)
        {
            System.out.print("Please enter array numbers:");
            a[i]=Integer.parseInt(xy.readLine().trim());
            if(a[i]%2==0)
                b[x++]=a[i];
            else
                c[y++]=a[i];
        }
        for(int j=0;j<20;j++)
            System.out.println("Array numbers: "+a[j]);
        for(int k=0;k<x;k++)
            System.out.println("Even numbers: "+b[k]);
        for(int l=0;l<y;l++)
            System.out.println("Odd numbers: "+c[l]);
    }
}
