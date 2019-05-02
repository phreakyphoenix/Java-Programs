//This file writes a string to  a binary file.
import java.io.*;
class DataWrite
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fout = new FileOutputStream ("D:/man.txt");
            DataOutputStream w = new DataOutputStream (fout);
            int a=34;   
            w.writeInt(a);
            w.close();
            fout.close();
            System.out.println("Success...");
        }
        catch(Exception e)
        {
            System.out.println("File not Found");
        }
    }
}