/* This program prints a rectangle with diamond gap exactly at the centre,
 * using an input string with odd number of characters.
 */
import java.util.Scanner;
public class diamond
{
    void create()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string with a - separating two identical words with odd number of characters: ");
        String s=sc.nextLine();
        int l=s.length();
        int n=s.indexOf('-');
        String s1=s.substring(0,n);
        String s2=s.substring(n+1);
        if (s1.equals(s2)==false)
        {
            System.out.println("Wrong Input."); 
            create();
        }
        else
        {
            s=s1;
            l=s1.length();
            System.out.println("The pattern is:");
            int k=l,b,x=0;
            for (int i=0;i<l;i++)
            {
                System.out.print(s1.substring (0,k));
                for (b=0;b<l-(k-i);b++)
                {
                    System.out.print(" ");
                }
                System.out.print(s1.substring (x,l));
                x++;k--;
                System.out.println();
            }

            int y=l-2;
            for (int i= 1;i<l;i++)
            {
                System.out.print(s1.substring (0,i+1));
                for (b=0;b<2*y;b++)
                {
                    System.out.print(" ");
                }
                System.out.println(s1.substring (y--));
            }
        }
    }
}

OUTPUT:
Enter a string with a - separating two identical words with odd number of characters: 
HAPPY-HAPPY
The pattern is:
HAPPYHAPPY
HAPP  APPY
HAP    PPY
HA      PY
H        Y
HA      PY
HAP    PPY
HAPP  APPY
HAPPYHAPPY
