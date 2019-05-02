class blue
{
    void dispaly()
    {
        String s = "Blue bottle is in the blue bag lying on the blue carpet.";
        s=s+" ";
        int l=s.length();
        String w="";
        for(int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                if(w.equalsIgnoreCase("blue"))
                System.out.print("red");
                else
                System.out.print(w);
                System.out.print(" ");
                w="";
            }
            else
            w=w+ch;
        }
    }
}
