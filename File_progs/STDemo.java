// Demonstrate StringTokenizer. 
import java.util.StringTokenizer; 
class STDemo 
{ 
    static String s ="Raju is my, brother."; 
    public static void main() 
    { 
        StringTokenizer st = new StringTokenizer(s, "., ;"); 
        while(st.hasMoreTokens()) 
        { 
            System.out.println(st.nextToken()); 
            System.out.println(st.countTokens());
        } 
    } 
}