import java.io.*;
class Node
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n;Node nxt;
    void getdata()throws IOException
    {
        System.out.println("Enter number");
        n=Integer.parseInt(br.readLine());
    }
    void display()
    {
        System.out.println(n);
    }
}