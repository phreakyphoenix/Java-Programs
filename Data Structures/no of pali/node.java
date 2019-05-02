import java.io.*;
class node
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n;node nxt;
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