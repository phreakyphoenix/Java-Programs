class words 
{
  void gui(String y)
  {
       int i,r=1;
       int l=y.length();
       for(i=0;i<l;i++)
       {
           char g=y.charAt(i);
           if(g==' ')
           {
               r=r+1;
            }
        }
        System.out.println("The no of words in the sentence are"+r);
    }
}

 