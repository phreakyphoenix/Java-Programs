class check_for_word
{
    /** s is the sentence 
     *  a is the word for checking
     */
    void check(String s,String a)
    {
        s=s+" ";
        int l= s.length();
        String w="";
        int x=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                if(w.equalsIgnoreCase(a))
                {
                    x=1;
                }
                w=null;
            }
            else
            {
                w=w+ch;
            }
         }
        if(x==0)
        System.out.println("Not Present");
        else
        System.out.println("It is present in the sentence "+x+" times");
    }
}
