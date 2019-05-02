import java.io.*;
class WordFor
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    String ar[]=new String[5];
    char w[]=new char[5];
    public void display()throws IOException
    {
        int i,j;
        String word="";
        String newword="";
        char tmp=' ';
        System.out.println("Enter 5 words: ");
        for(i=0;i<5;i++)
            ar[i]=xy.readLine();
        for(i=0;i<5;i++)
        {
            word=word+ar[i].charAt(0);
        }
        System.out.println("The word is:"+ word);
        for(i=0;i<5;i++)
        {
            w[i]=word.charAt(i);
        }
        for(i=0;i<4;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(w[i]>w[j])
                {
                    tmp=w[i];
                    w[i]=w[j];
                    w[j]=tmp;
                }
            }
        }
        for(i=0;i<5;i++)
        {
            newword=newword+w[i];
        }
        System.out.print("The alphabetically sorted word is: "+newword);
    }
}