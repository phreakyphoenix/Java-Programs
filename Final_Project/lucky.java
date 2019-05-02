//This program displays the lucky numbers upto a certain value.
import java.io.*;
class lucky
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    void check()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Number of Elements : ");
        int n=Integer.parseInt(br.readLine());
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=i+1;
        for(int i=1;i<n-1;i++)
        {
            for(int j=i;j<n;j=j+i)
            {
                for(int k=j;k<n-1;k++)
                    ar[k]=ar[k+1];
                n--;    
            }
        }
        System.out.println("The lucky numbers are: ");
        for(int j=0;j<n;j++)
            {
                System.out.print(ar[j]+" ");
            }
    }
}

OUTPUT:
Enter the Number of Elements : 50
The lucky numbers are: 
1 3 7 13 19 27 39 49 
