// This program removes all vowels.
import java.io.*; 
class VowelRemoval
{
    public static void main()
    {
        try
        {
            FileInputStream fin= new FileInputStream("D:/abc.txt");
            FileOutputStream fout = new FileOutputStream("D:/temp.txt");
            int i=0;
            while((i=fin.read())!=-1)
            {
                char c=(char)i;
                if(c!='a'&&c!='A'&&c!='e'&&c!='E'&&c!='A'&&c!='i'&&c!='I'&&c!='o'&&c!='O'&&c!='u'&&c!='U')
                {
                    fout.write(i);
                }
            }
            fin.close();
            fout.close();
            File inFile=new File("D:/abc.txt");
            File outFile=new File("D:/temp.txt");
            if(inFile.delete())
            {
                outFile.renameTo(inFile);
            }
        }
        catch(Exception e)
        {
            System.out.println("File Not Found.");
        }
    }
}