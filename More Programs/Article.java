import java.io.*;
class Article
{
    static String ar[]=new String[10];
    static double pr[]=new double[10];
    public void accept()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter name of article and it's price: ");
            ar[i]=in.readLine();
            pr[i]=Double.parseDouble(in.readLine());
        }
    }
    public void display()throws IOException
    {
        int flag=0,i;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name of an article: ");
        String a=in.readLine();
        for(i=0;i<10;i++)
        {
            flag=0;
            if(a.equalsIgnoreCase(ar[i]))
            {
                System.out.println("The price of "+ar[i]+" is: "+pr[i]);
                break;
            }
        }
    }
}