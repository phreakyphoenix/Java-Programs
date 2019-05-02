import java.io.*;
class FNRET
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    int a,b;
    FNRET()
    {
        a=0;
        b=0;
    }
    private int sum(int x, int y)
    {
        a=x;b=y;
        return a+b;
    }
    void display()throws IOException
    {
        System.out.println("Please enter one no");
        int p = Integer.parseInt(xy.readLine());
        System.out.println("Please enter another no");
        int q = Integer.parseInt(xy.readLine());
        System.out.println("The sum is "+sum(p,q));
    }  
    
}
