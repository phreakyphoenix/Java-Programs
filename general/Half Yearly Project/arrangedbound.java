// This program arranges the boundary elements in ascendng order.
import java.io.*;
class arrangedbound
{
    public static void main()throws IOException
    {
        BufferedReader xy= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of rows of matrix: ");
        int m=Integer.parseInt(xy.readLine());
        System.out.println("Enter number of columns of matrix: ");
        int n=Integer.parseInt(xy.readLine());
        int ar[][]= new int[m][n];
        int b[]= new int[m*n];
        System.out.println("Enter elements of matrix: ");
        for(int i=0; i<m;i++) //aceept array elements
        {
            for(int j=0; j<n;j++) 
            {
                ar[i][j]=Integer.parseInt(xy.readLine());
            }
        }
        int c=0;
        for (int i=0;i<n;i++)
            b[c++]=ar[0][i];
        for (int i=1;i<m;i++)
            b[c++]=ar[i][n-1];
        for (int i=n-2;i>=0;i--)
            b[c++]=ar[m-1][i];
        for (int i=m-2;i>=1;i--)
            b[c++]=ar[i][0];
        for(int i=0;i<c-1;i++)//arranging boundary elements in ascending order
        {
            for(int j=0;j<c-1-i;j++)
            {
                if(b[j]>b[j+1])
                {
                    int t=b[j+1];
                    b[j+1]=b[j];
                    b[j]=t;
                }
            }
        }
        c=0;
        //assigning ordered elements to array
        for (int i=0;i<n;i++)
            ar[0][i]=b[c++];
        for (int i=1;i<m;i++)
            ar[i][n-1]=b[c++];
        for (int i=n-2;i>=0;i--)
            ar[m-1][i]=b[c++];
        for (int i=m-2;i>=1;i--)
            ar[i][0]=b[c++];
        System.out.println ("The new array is: ");
        for(int i=0; i<m;i++) //display new array elements
        {
            for(int j=0; j<n;j++) 
            {
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
    }//end of main method
}//end of class

OUTPUT:
Enter number of rows of matrix: 
3
Enter number of columns of matrix: 
4
Enter elements of matrix: 
1
2
3
4
5
6
7
8
9
10
11
12
The new array is: 
1	2	3	4	
12	6	7	5	
11	10	9	8	