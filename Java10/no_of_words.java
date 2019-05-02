class no_of_words
{
   void main(String s)
    {
        int l=s.length();
        int c=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            c++;
        }
        int w = c+1;
        System.out.println(w);
    }
}
