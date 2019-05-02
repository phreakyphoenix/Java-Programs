/* 123454321
 * 1234 4321
 * 123   321
 * 12     21
 * 1       1
 */

class inversewedge
{
    void main()
    {
        int b=0;
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==5)
                break;
                else
                System.out.print(j);                
            }
            for(int m=1;m<=b;m++)
            {
                if(m==1)
                continue;
                else
                System.out.print(" ");
            }
            b=b+2;
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
