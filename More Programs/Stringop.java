import java.io.*;
class Stringop
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    String str;
    Stringop()
    {
        str=null;
    }
    void encode()throws IOException
    {
        System.out.println("Enter the string to be coded");
        str=xy.readLine();
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            char c = (char)(ch+2);
            System.out.print(c);
        }
    }
    void print()throws IOException
    {
        System.out.println("Enter the string");
        str=xy.readLine();
        str=str+" ";
        int l=str.length();
        String w="";
        for(int i=0;i<l;i++)
        {
            char ch = str.charAt(i);
            if(ch==' ')
            {
                System.out.println(w);
                w="";                
            }
            else
            w=w+ch;
        }
    }
}