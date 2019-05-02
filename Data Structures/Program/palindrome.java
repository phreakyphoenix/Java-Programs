//This program accepts word and checks whether it is palindromic or not.
import java.io.*;
class palindrome
{
    BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    String w="";

    void accept()throws IOException
    {
        System.out.println("Enter a word:");
        w=xy.readLine();
    }

    String reverse()
    {
        return new StringBuffer(w).reverse().toString();
    }

    void display()
    {
        if(w.equalsIgnoreCase(reverse()))
            System.out.println("The word is palindromic.");
        else
            System.out.println("The word is not palindromic.");
    }
    
    void main()throws IOException
    {
        accept();
        display();
    }
}
OUTPUT:
Enter a word:
Madam
The word is palindromic.

