public class primeFactors 
{
    void main(int n)
    {
        for(int i=2;i<=n;)
        {
            if(n%i==0)
            {
                System.out.println(i);
                n=n/i;
            }
            else
            i++;
        }
    }
}

