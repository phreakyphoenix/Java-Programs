import java.util.StringTokenizer;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception 
    {
    
        BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(xy.readLine());
        String s=xy.readLine();
        int a[]=new int[t];int p=0;
        StringTokenizer st =new StringTokenizer(s);
        while (st.hasMoreTokens())
            a[p++]=Integer.parseInt(st.nextToken());
        for (int i=0;i<t;i++)
            for (int j=1;j<=a[i];j++)
            {
                if (j%5 ==0 &&j%3==0)
                System.out.println("FizzBuzz");
                else if(j%5==0)
                System.out.println("Buzz");
                else if(j%3==0)
                System.out.println("Fizz");
                else 
                System.out.println(j);
            }
    }
}
