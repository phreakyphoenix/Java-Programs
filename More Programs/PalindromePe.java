class PalindromePe 
{
    public void display()
    {
        int r,n,op=0,flag=0;
        System.out.println("The list of 4 digit palindromic prime numbers are: ");
        for(int i=1000;i<=9999;i++)
        {
            n=i;
            op=0;
            while(n!=0)
            {
                r=n%10;
                op=op*10+r;
                n=n/10;
            }
            if(op==i)
            {
                for(int j=2;j<i;j++)
                {
                    flag=0;
                    if(op%j==0)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag!=1)
                    System.out.println(op);
            }
        }
    }
}                