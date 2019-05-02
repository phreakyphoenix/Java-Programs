import java.math.BigInteger;
public class BigInt
{
    static BigInteger a=new BigInteger("0");
    static BigInteger b=new BigInteger("1");
    static BigInteger c;
    static int lim=1000-1,ul=lim+2;
    public static void main(String[] args)
    {long startNanos=System.nanoTime();
        System.out.println("0\t:\t0\n1\t:\t1");
        fb(lim);
        long stopNanos=System.nanoTime();
        System.out.println("Execution took " +((stopNanos-startNanos)/1000)+" ms");
    }

    static void fb(int lim)
    {
        
        if(lim==0)
            return;
        else
        {
            c=a.add(b);
            System.out.println(ul-lim+"\t:\t"+c);
            a=b;    
            b=c;
            lim-=1;
            fb(lim);
        }
            }
}
