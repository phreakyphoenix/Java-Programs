import java.io.*;
class pali_word
{
    public static void main()
    {
        try
        {
            FileInputStream fin = new FileInputStream("D:/abc.txt");
            int i=0;String w="";
            while((i=fin.read())!=-1)
            {
                char c=(char)i;
                if(Character.isLetterOrDigit(c)==false)
                {
                    if(w.equalsIgnoreCase(new StringBuffer(w).reverse().toString()))
                    System.out.println(w);
                    w="";
                }
                else 
                w=w+c;
            }
        }
        catch(Exception e)
        {
            System.out.println("Error.");
        }
    }
}