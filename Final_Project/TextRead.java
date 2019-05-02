// This program reads data from a binary file and displays it.
import java.io.*;
class TextRead
{
    public static void read()
    {
        try
        {
            FileInputStream fin = new FileInputStream ("D:/abc.txt");
            int i=0;
            while((i=fin.read())!=-1)
            {
                char c= (char)i;
                System.out.print(c);
            }
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println("File not Found");
        }
    }
}

OUTPUT:
Hello World !!
            