import java.util.*;
class words
{
    void test()
    {
        String s="I am Lord Voldemort, My name is Aditya.";
        StringTokenizer st=new StringTokenizer(s,", .");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}