import java.io.*;
class fractionorpower_magic
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    void display()throws IOException
    {
        double a;
        for(a=1;a>=1;a++)
        {
            System.out.println("Enter 1 to display series 1/2, 2/3, 3/4,...19/20");
            System.out.println("Enter 2 to display series 1^1, 2^2, 3^3,...n^n");
            System.out.println("Enter your choice");
            int c = Integer.parseInt(xy.readLine());
            switch(c)
            {
                case 1:
                double i;
                for(i=1;i<=19;i++)
                {
                    System.out.println(i/(i+1));            
                }          
                break;
                case 2:
                System.out.println("Enter last integer value or n");
                int n = Integer.parseInt(xy.readLine());           
                for(int q=1;q<=n;q++)
                {
                    System.out.println(Math.pow(q,q));            
                }           
                break;
                default:System.out.println("Wrong choice");
            }
        }
    }
}
