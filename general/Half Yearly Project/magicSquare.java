//This programs checks whether a matrix is a magic matrix or not.
import java.io.*;
public class magicSquare
{
    public static void main()throws IOException
    {
        BufferedReader xy= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter order of matrix: ");
        int n=Integer.parseInt(xy.readLine());
        int a[][]= new int[n][n];
        int b[]= new int[n+n+2];
        System.out.println("Enter elements of matrix: ");
        for(int i=0; i<n;i++) //aceept array elements
        {
            for(int j=0; j<n;j++) 
            {
                a[i][j]=Integer.parseInt(xy.readLine());
            }
        }
        int sum=0,c=0;
        for(int i=0;i<n;i++)// calculates sum of each row
        {
            for(int j=0;j<n;j++)
            {
                sum=sum+a[i][j];
            }
            b[c++]=sum;
            sum=0;
        }
        for(int i=0;i<n;i++)// calculates sum of each column
        {
            for(int j=0;j<n;j++)
            {
                sum=sum+a[j][i];
            }
            b[c++]=sum;
            sum=0;
        }
        for(int i=0;i<n;i++)// calculates sum of left diagonal
        {
            sum=sum+a[i][i];
        }
        b[c++]=sum;
        sum=0;
        for(int i=0;i<n;i++)// calculates sum of right diagonal
        {
            sum=sum+a[n-i-1][i];
        }
        b[c++]=sum;
        boolean flag=true;
        for(int i=0;i<c-1;i++)
        {
            if(b[i]!=b[i+1])
            {
                System.out.println("It is not a Magic Matrix.");
                flag=false;
                break;
            }
        }
        if(flag==true)
        System.out.println("It is a Magic Matrix.");
    }//end of main method
}//end of class

OUTPUT:
Enter order of matrix: 
3
Enter elements of matrix: 
2
9
4
7
5
3
6
1
8
It is a Magic Matrix.
