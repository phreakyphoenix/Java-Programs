//This program takes the generates a spiral matrix in ascending order starting with 1
import java.io.*;
class spiralClock
{
    public void main()
    {
        BufferedReader xy= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of rows of matrix: ");
        int m=Integer.parseInt(xy.readLine());
        System.out.println("Enter number of columns of matrix: ");
        int n=Integer.parseInt(xy.readLine());
        int ar[][]= new int[m][n];
        
        
        
        
        
        
        
        
        /* Printing the spiral matrix */
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}