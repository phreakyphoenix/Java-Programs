import java.util.Scanner;
class PalindromeWord
{
    String ar[]=new String[10];
    public void display()
    {
        Scanner in=new Scanner(System.in);
        int i,j,l;
        char ch;
        String w=null;
        System.out.println("Enter 10 words: ");
        for(i=0;i<10;i++)
            ar[i]=in.next();
        System.out.println("The palindromic words are: ");   
        for(i=0;i<10;i++)
        {
            l=ar[i].length();
            for(j=0;j<l;j++)
            {
                ch=ar[i].charAt(j);
                w=ch+w;
            }
            if(w.equalsIgnoreCase(ar[i]))
                System.out.println(ar[i]+" ");
            w="";    
        }
    }
}
