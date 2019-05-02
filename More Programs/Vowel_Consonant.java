import java.io.*;
class Vowel_Consonant
{
    char ch;
    int isVowel()throws IOException
    {
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a character: ");
        ch=(char)xy.read();

        char ch1=Character.toUpperCase(ch);        
        if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')
            return 1;
        else
            return 0;

    }

    void display()throws IOException
    {
        int c=isVowel();
        if(c==1)
            System.out.println(ch+" is a Vowel.");
        if(c==0)
            System.out.println(ch+" is a Consonant.");
    }
}
