import java.io.*;
class triangle_flow
{
    void design()throws IOException
    {
        BufferedReader xy = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String s =xy.readLine();
        System.out.println("Enter a for first design");
        System.out.println("Enter b for first design");
        System.out.println("Enter your choice");
        char c = (char)xy.read();
        int l=s.length();
        switch(c)
        {
            case 'a':
            int b=l-1;
            for(int i=0;i<l;i++)
            {
                for(int k=1;k<=b;k++)
                {
                   System.out.print(" ") ;
                } 
                b--;
                for(int j=0;j<=i;j++)
                {
                   System.out.print(s.charAt(i));
                } 
                System.out.println();
            }
            break;
            case 'b':
            int bl=0;
            for(int g=l;g>=1;g--)
            {
                for(int k=1;k<=bl;k++)
                {
                   System.out.print(" ");                   
                } 
                bl++;
                System.out.print(s.substring(0,g));             
                System.out.println();
            }
        }
    }
}