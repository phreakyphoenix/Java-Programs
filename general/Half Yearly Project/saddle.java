//Program to display saddle point of a matrix (row max and column min).
import java.io.*;
class saddle
{
    BufferedReader xy= new BufferedReader(new InputStreamReader(System.in));
    int m,n,max,min,flag=0;
    int a[][];
    private void input()throws IOException
    {
        System.out.println("Enter number of rows of matrix: ");
        m=Integer.parseInt(xy.readLine());
        System.out.println("Enter number of columns of matrix: ");
        n=Integer.parseInt(xy.readLine());
        a= new int[m][n];
        System.out.println("Enter elements of matrix: ");
        for(int i=0; i<m;i++) //aceept array elements
        {
            for(int j=0; j<n;j++)
            {
                a[i][j]=Integer.parseInt(xy.readLine());
            }
        }
    }//end of input method

    private void display()
    {
        int colpos=0;
        for(int i=0;i<m;i++)
        {
            max=a[i][0];
            for(int j=0; j<n;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                    colpos=j;
                }
            }
            min=a[0][colpos];
            for(int j=0; j<m;j++)
            {
                if(a[j][colpos]<min)
                {
                    min=a[j][colpos];
                }
            }
            if(max==min)
            {
                System.out.println("The saddle point is: "+max);
                flag++;
            }
        }
        if(flag==0)
            System.out.println("There is no saddle point in the matrix.");
    }//end of display method

    void main()throws IOException
    {
        saddle obj=new saddle();//object creation
        obj.input();
        obj.display();
    }
} //end of class

OUTPUT:
Enter number of rows of matrix: 
2
Enter number of columns of matrix: 
2
Enter elements of matrix: 
1
2
3
4
The saddle point is: 2