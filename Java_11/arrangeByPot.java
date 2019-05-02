import java.io.*;
import java.util.StringTokenizer;
class arrangeByPot
{
    String s;
    BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    void accept()throws IOException
    {
        System.out.print("INPUT\t:");
        s=xy.readLine().trim().toUpperCase();
        if(!(s.charAt(s.length()-1)=='.'||s.charAt(s.length()-1)=='!'||s.charAt(s.length()-1)=='?'))
            accept();
    }

    int pot(String s)
    {
        int pot=0;
        for(int i=0;i<s.length();i++)
            pot=(int)s.charAt(i)-64+pot;
        return pot;
    }

    void main()throws IOException
    {
        accept();
        System.out.println("POTENTIAL :");
        int c=0;
        StringTokenizer st = new StringTokenizer(s,".?! ");
        int now = st.countTokens();
        String arr[]= new String[now];
        int ar[]=new int [now];
        while(st.hasMoreTokens())
        {
            arr[c]=st.nextToken();
            ar[c]=pot(arr[c]);
            System.out.println(arr[c]+"\t= "+ar[c]);
            c++;
        }

        for(int i=0;i<now-1;i++)
        {
            for(int j=0;j<now-1-i;j++)            
            {
                if(ar[j]>ar[j+1])
                {
                    int t=ar[j];
                    ar[j]= ar[j+1];
                    ar[j+1]=t;
                    String str=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=str;
                }
            }
        }
        
        System.out.print("OUTPUT\t: ");
        for(int i=0;i<now;i++)
        System.out.print(arr[i]+" ");
    }
}
