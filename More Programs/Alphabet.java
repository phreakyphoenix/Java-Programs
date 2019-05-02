 import java.io.*;
class Alphabet
{
    public void check()throws IOException
    {
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter character: ");
        char ch=(char)xy.read();
        if(Character.isDigit(ch))
            System.out.println(ch+" is a digit.");
        else if(Character.isLetter(ch))
        {
            if(Character.isUpperCase(ch))
                System.out.println(ch+" is an upper case alphabet.");
            else
                System.out.println(ch+" is a lower case alphabet.");
        }
        else
            System.out.println("Not an alphabet or digit");
    }
}
        
            