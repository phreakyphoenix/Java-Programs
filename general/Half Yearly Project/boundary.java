// This program dispalys the sum of boundary eleents
import java.io.*;
class boundary
{
    public static void main()throws IOException
    {
        BufferedReader xy= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of rows of matrix: ");
        int m=Integer.parseInt(xy.readLine());
        System.out.println("Enter number of columns of matrix: ");
        int n=Integer.parseInt(xy.readLine());
        int ar[][]= new int[m][n];
        System.out.println("Enter elements of matrix: ");
        for(int i=0; i<m;i++) //aceept array elements
        {
            for(int j=0; j<n;j++) 
            {
                ar[i][j]=Integer.parseInt(xy.readLine());
            }
        }

        int s=0;
        for (int i=0;i<n;i++)
            s=s+ar[0][i];
        for (int i=1;i<m;i++)
            s=s+ar[i][n-1];
        for (int i=n-2;i>=0;i--)
            s=s+ar[m-1][i];
        for (int i=m-2;i>=1;i--)
            s=s+ar[i][0];
        System.out.println("The Sum of boundary elements is: "+s);    
    }//end of main method
}//end of class

OUTPUT:
Enter number of rows of matrix: 
3
Enter number of columns of matrix: 
3
Enter elements of matrix: 
5
6
2
4
5
6
2
5
8
The Sum of boundary elements is: 38
