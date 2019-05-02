//This file writes a string to  a binary file.
import java.io.*;
class TextWrite
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fout = new FileOutputStream ("D:/abc.txt");
            String s = "Hello World !!";
            byte b[]=s.getBytes();                //convets string to byte array
            fout.write(b);
            fout.close();
            System.out.println("Success...");
        }
        catch(Exception e)
        {
            System.out.println("File not Found");
        }
    }
}