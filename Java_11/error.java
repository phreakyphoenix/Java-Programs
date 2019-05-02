import java.io.*;
class error
{
    BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException
    {
        PrintStream out = new PrintStream(new FileOutputStream("d:/a.txt"));
        System.setErr(out);
        try
        {
            System.out.println("Enter no");
            int n=Integer.parseInt(xy.readLine());
        }
        catch(NumberFormatException e)
        {
            System.err.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        out.close();
    }    
}
