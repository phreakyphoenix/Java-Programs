/*Input a square matrix m*m.Display original 
   matrix,diagonal elements and non-diagonal elements
*/
import java.util.Scanner;
class matrix
{
    void input ()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows and columns");
        int m=sc.nextInt();
        int a[][]=new int[m][m];
        System.out.println("Enter the numbers");
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        display(a,m);
    }
    void display(int a[][],int m)
    {
        System.out.println("the original matrix");
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }        
        System.out.println("the diagonal elements");
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if (i==j || i==m-1-j)
                System.out.print(a[i][j]+"\t");
            }
        }
        System.out.println("the non diagonal elements");
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if( !(i==j || i==m-1-j))
                System.out.print(a[i][j]+"\t");
            }
        }
    }
}


  OUTPUT
  Enter no. of rows and columns
  3
  Enter the numbers
  1
  2
  3
  4
  5
  6
  7
  8
  9
  the original matrix
  1	  2	  3   	
  4	  5	  6	
  7	  8   9	
  System.out.println("the diagonal elements");
  1	  3	  5   7	  9	
  System.out.println("the non diagonal elements");
  2	  4	  6	  8	
  