import java.io.*;
class node
{
    BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    int n; node prv;
    void input()throws IOException
    {
        System.out.println("Enter number");
        n=Integer.parseInt(xy.readLine());
    }
    void display()
    {
        System.out.println(n);
    }
}