class PalindromePrime
{
    public void display()
    {
        int i,j,d,num,pnum=0,flag=0;
        System.out.print("The list of 4 digit palindromic prime numbers are: ");
        for(i=1000;i<=9999;i++)
        {
            num=i;
            pnum=0;
            while(num!=0)
            {
                d=num%10;
                pnum=pnum*10+d;
                num=num/10;
            }
            if(pnum==i)
            {
                for(j=2;j<i;j++)
                {
                    flag=0;
                    if(pnum%j==0)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag!=1)
                    System.out.print(pnum+" ");
            }
        }
    }
}                