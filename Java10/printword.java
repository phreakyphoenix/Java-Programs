class printword
{
    void main(String s)
    {
        int l=s.length();
        int x=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                for(int y=x;y<i;y++)
                {
                    System.out.print(s.charAt(y));
                }
                System.out.println();
                x=i+1;
            }
        }
        for(int z=x;z<l;z++)
        {
             System.out.print(s.charAt(z));
        }
    }
}
