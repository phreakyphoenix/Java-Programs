import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        ArrayList <BigDecimal> l=new ArrayList <BigDecimal>();
        for(int i=0;i<9;i++)
            l.add(new BigDecimal(s[i]));
        Collections.sort(l);
        n--;
        System.out.println(l.toString());
        while(n>=0)
            s[n]=String.valueOf(l.get(n--));
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}