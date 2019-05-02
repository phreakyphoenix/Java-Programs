import java.io.*;
class des_ten_eleven
{
 BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
 void main()throws IOException
 {
     System.out.println("Enter 1 for first design");
     System.out.println("Enter 2 for first design");
     System.out.println("Enter your choice");
     int c = Integer.parseInt(xy.readLine());
     switch(c)
     {
         case 1:
         for(int i=1;i<=5;i++)
         {
             System.out.print(i);
             for(int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             System.out.println();         
         }
         break;
         case 2:
         int i,j,b,x=0;
         for(i=5;i>=1;i--)
         {
            for(j=1;j<=i;j++)
            {
               if(j==5)
               break;
               System.out.print(j);
            }
            for(b=1;b<=x;b++)
            {
               if(b==2)
               continue; 
               System.out.print(" ");
            }
            x=x+2;
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
         }
         break;
         default: System.out.println(" Wrong Choice ");
        }
    }
}
       

