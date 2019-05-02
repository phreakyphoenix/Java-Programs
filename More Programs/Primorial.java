class Primorial
{
    public void isprime(int n)
    {
        int i,j,p=1,flag=0,pn;
        for(i=2;i<n;i++)
        {
            pn=i;
            for(j=2;j<i;j++)
            {
                flag=0;
                if(pn%j==0)
                { 
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                p=p*pn;
        }
        System.out.println("The primorial of "+n+" is: "+p);
    }
}
            