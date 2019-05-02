//This programs displays an antispiral matrix of order n*n in anticlockwise direction.
import java.util.*;
class matrixanticlock
{ 
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m[][]=new int[16][16],x,step;
        int n;
        System.out.println("Enter No. of rows of square matrix : ");
        n=sc.nextInt();
        int count=1,i=n/2,j=(n-1)/2;
        for(step=1;step<n;step++)
        { 
            for(x=0;x<step;x++)
            {
                m[i][j]=count++;
                if(step%2==1)
                    j++;
                else
                    j--;
            }
            for(x=0;x<step;x++)
            {
                m[i][j]=count++;
                if(step%2==1)
                    i--;
                else
                    i++;
            }
        }
        for(x=0;x<n;x++)
        {
            m[i][j]=count++;
            if(n%2==1)
                j++;
            else
                j--;
        }
        for(i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
                System.out.print(m[i][j]+"\t");
            System.out.println();
        }
    }
}

OUTPUT:
Enter No. of rows of square matrix : 
5
17	16	15	14	13	
18	5	4	3	12	
19	6	1	2	11	
20	7	8	9	10	
21	22	23	24	25	
