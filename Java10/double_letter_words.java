 class double_letter_words
{
    void dispaly(String st)
    {
        String s=st.toUpperCase();
        s=s+" ";
        int l=s.length();
        String w="";
        for(int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                int wl=w.length();
                for(int j=0;j<wl-1;j++)
                {
                    char c=w.charAt(j);
                    char d=w.charAt(j+1);
                    if(c==d)
                    {
                        System.out.print(w+" ");
                        break;
                    }
                }
                w="";                
            }
            else
            w=w+ch;
        }
    }
}
