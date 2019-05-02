import java.io.*;
class zzz
{
    BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    String s,key;
    void accept()throws IOException
    {
        System.out.println("Enter String");
        s=xy.readLine();
        System.out.println("Enter key");
        key=xy.readLine();
    }

    String encoded()
    {
        int p=0;
        int k=key.length();
        String sn="";
        for(int i=0;i<s.length();i++)
        {
            sn=sn+(char)((int)s.charAt(i)+(int)key.charAt(p++));
            if(p==k)
                p=0;
        }
        return sn;
    }

    String decoded()
    {
        int p=0;
        int k=key.length();
        String sn="";
        for(int i=0;i<s.length();i++)
        {
            sn=sn+(char)((int)s.charAt(i)-(int)key.charAt(p++));
            if(p==k)
                p=0;
        }
        return sn;
    }

    void main()throws IOException
    {
        System.out.println("Enter 1 to encode, 2 to decode");
        int z=Integer.parseInt(xy.readLine());
        if(z==1)
        {
            accept();
            System.out.println(encoded());
        }

        else if(z==2)
        {
            accept();
            System.out.println(decoded());
        }

        else
        {
            System.out.println("Tor dara ar holo na XD");
        }
    }    
}
