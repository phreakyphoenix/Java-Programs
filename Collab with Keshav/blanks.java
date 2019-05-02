class blanks
{
    void main(String s)
    {
           int l=s.length();
           int a=1;
            for(int i=0;i<l;i++)
           {
               char ch=s.charAt(i);
               if(ch==' ')
               a++;
           }
           System.out.println(a);
    }
}                                      