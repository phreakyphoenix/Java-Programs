class Auto_Capitalisation
{
    void check(String s)
    {
        s=s+" ";
        int l= s.length();
        String w="" ;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                System.out.println(Character.toUpperCase(w.charAt(0))+w.substring (1));
                w="" ;
            }
            else
            {
                w=w+ch;
            }
         }
    }
}