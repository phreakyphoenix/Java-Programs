class disarium
{
    void main()
    {
        for(int i=1;i<=2000;i++)
        {
            int n=i;
            int r,c=n;
            double s=0;
            String st=String.valueOf(n);
            int l=st.length();
            while(n!=0)
            {
                r=n%10;
                n=n/10;
                s=s+Math.pow(r,l);
                l--;
            }
            if(c==s)
                System.out.println(c);
        }
    }
}