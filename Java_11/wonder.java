import java.io.*;
class wonder
{    
    public void gen(int n) 
    {
        int r=0,c=n/2;
        int ar[][]=new int[n][n];
        for(int i=1;i<=n*n;i++)
        {
            ar[r][c]=i;
            int p=r-1;
            int q=c+1; 
            if(p==-1)p=n-1;
            if(q==n)q=0;
            if(ar[p][q]!=0)
            {
                r++;
                if(r==n)r=0;
            }
            else
            {
                r=p;
                c=q;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    void main()throws IOException
    {
        System.out.print("Enter size of the wondrous square you wan to create: ");
        BufferedReader xy = new BufferedReader (new InputStreamReader(System.in));
        int n=Integer.parseInt(xy.readLine());
        gen(n);
    }
}
