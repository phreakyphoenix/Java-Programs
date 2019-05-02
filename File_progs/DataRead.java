//This file writes a string to  a binary file.
import java.io.*;
class DataRead
{
    public static void read()throws IOException
    {
        boolean eof=false;
        try
        {
            FileInputStream fout = new FileInputStream ("D:/man.dat");
            DataInputStream w = new DataInputStream (fout);
            while(!eof)
            {
                int s = w.readInt();
                System.out.println(s);
                w.close();
                fout.close();
            }
        }
        catch(Exception e)
        {
            eof=true;
        }
    }
}