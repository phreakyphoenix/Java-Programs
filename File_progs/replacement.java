// This program replaces all instances of 'is' with 'are'.
import java.io.*; 
class replacement
{
    public static void main()
    {
        try
        {
            FileInputStream fin= new FileInputStream("D:/abc.txt");
            FileOutputStream fout = new FileOutputStream("D:/temp.txt");
            int i=0; String w="";
            while((i=fin.read())!=-1)
            {
                char c=(char)i;
                if(Character.isLetterOrDigit(c)==false)               //TRUE IF SPACE
                {
                    if(w.equalsIgnoreCase("IS")==false)
                    {
                        w=w+c;
                        byte b[]=w.getBytes();
                        fout.write(b);
                    }
                    else
                    {
                        w="are"+c;
                        byte b[]=w.getBytes();
                        fout.write(b);
                    }
                    w="";
                }
                else
                    w=w+c;
            }
            fin.close();
            fout.close();
            File inFile=new File("D:/abc.txt");
            File outFile=new File("D:/temp.txt");
            if(inFile.delete())
                outFile.renameTo(inFile);
        }
        catch(Exception e)
        {
            System.out.println("File Not Found.");
        }
    }
}