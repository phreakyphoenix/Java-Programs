/**
 * To print fibonacci series using recurring function
 */
import java.io.*;
class rec_fibo
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    private void fibo(int a,int b,int n)
    {
        if(n==0)
            return;
        System.out.println(a+b);
        fibo(b,a+b,n-1);
    }

    void display()throws IOException
    {
        System.out.println("Enter the number of terms in the fibonacci series");
        int n=Integer.parseInt(br.readLine());
        System.out.println("The Series is- ");
        System.out.println(0);
        System.out.println(1);
        fibo(0,1,n-2);
    }
}
/**
 * The Output is
Enter the number of terms in the fibonacci series
12
The Series is- 
0
1
1
2
3
5
8
13
21
34
55
89

 */
