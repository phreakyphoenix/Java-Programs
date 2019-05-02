import java.util.*;
class WordFormat
{
    String ar[]=new String[5];
    String w[]=new String[5];
    public void display()
    {
        int i,j;
        String tmp="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 5 words: ");
        for(i=0;i<5;i++)
            ar[i]=in.next();
        for(i=0;i<5;i++)
        {
            w[i]=ar[i].substring(0,1);
        }
        
        for(i=0;i<4;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(w[i].compareTo(w[j])>0)
                {
                    tmp=w[i];
                    w[i]=w[j];
                    w[j]=tmp;
                }
            }
        }
        System.out.print("The alphabetically sorted word is: ");
        for(i=0;i<5;i++)
            System.out.print(w[i]);
    }
}