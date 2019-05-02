class phone_no
{
    void sum()
    {
        int n,r;
        int s1,s2,s3,s4,s5,s6,s7,s8,s9;
        for(int i=100000000 ; i<=999999999;i++)
        {
            String s = String.valueOf(i);
            int l=9,flag=0;
            for(int k=0;k<l-1;k++)
            {
                for(int j=k+1;j<l;j++)
                {
                    if(s.charAt(k)==s.charAt(j))
                    {  flag=1;
                        break;
                    }
                }
            }
            if (flag==0)
            {
                s2=i/10000000;
                s3=i/1000000;
                s4=i/100000;
                s5=i/10000;
                s6=i/1000;
                s7=i/100;
                s8=i/10;
                s9=i;
                if (s9%9==0&&s8%8==0&&s7%7==0&&s6%6==0&&s5%5==0&&s4%4==0&&s3%3==0&&s2%2==0)
                    System.out.println(i); 
            }
            flag=0;
        }
    }
}