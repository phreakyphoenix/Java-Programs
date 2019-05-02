import java.io.*;
class design
{
    char a,b,c; int n; char ar[][];
    BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    void acceptsize()throws IOException
    {
        System.out.print("ENTER SIZE\t:");
        n=Integer.parseInt(xy.readLine());
    }

    void fill()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)            
            {
                if(i==j||i+j==n-1)
                    ar[i][j]=c;
                else if(i+j<n-1)
                {
                    if(i<j)
                        ar[i][j]=a;
                    else
                        ar[i][j]=b;
                }
                else
                {                    
                    if(i<j)
                        ar[i][j]=b;
                    else
                        ar[i][j]=a;                
                }
            }
        }
    }

    void main()throws IOException
    {
        acceptsize();
        if(n>100000)
            System.out.println("SIZE OUT OF RANGE");
        else
        {
            System.out.print("FIRST CHARACTER\t:");
            a=(char)xy.read();xy.read();
            System.out.print("SECOND CHARACTER:");
            b=(char)xy.read();xy.read();
            System.out.print("THIRD CHARACTER\t:");
            c=(char)xy.read();xy.read();
            ar=new char [n][n];
            fill();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)            
                {
                    System.out.print(ar[i][j]+"  ");
                }
                System.out.println();
            }
        }
    }
}
