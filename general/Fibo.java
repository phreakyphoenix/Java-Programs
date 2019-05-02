import java.util.*;
import java.math.*;
public class Fibo
{
    static void fib(int n)
    {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c ;
        for (int j=2 ; j<=n ; j++)
        {
            c =  a.add(b);
            System.out.println(c);
            a = b;
            b = c;
        }
    }
 
    public static void main(String[] args)
    {
        int n = 1000;
        fib(n);
    }
}