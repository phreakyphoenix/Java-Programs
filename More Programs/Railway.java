
import java.util.*;
class Railway
{
    static int d,fare;
    public static void main(String args[])
    {
        Railway obj=new Railway();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1 for railway fare of below 10 years age.");
        System.out.println("Enter 2 for railway fare of age between 10 and 60 years.");
        System.out.println("Enter 3 for railway fare if above 60 years age.");
        int c=in.nextInt();
        System.out.println("Enter distance travelled: ");
        d=in.nextInt();
        switch(c)
        {
            case 1:
            obj.age10();
            break;
            case 2:
            obj.age1060();
            break;
            case 3:
            obj.age60();
            break;
        }
    }
    public void age10()
    {
        if(d<10)
            fare=5*d;
        else if(d>=10 && d<=50)
            fare=5*10+20*(d-10);
        else if(d>50)
            fare=5*10+20*40+50*(d-50);
        System.out.println("The railway fare is: "+fare);
    }
    public void age1060()
    {
        if(d<10)
            fare=10*d;
        else if(d>=10 && d<=50)
            fare=10*10+40*(d-10);
        else if(d>50)
            fare=10*10+40*40+80*(d-50);
        System.out.println("The railway fare is: "+fare);
    }
    public void age60()
    {
        if(d<10)
            fare=4*d;
        else if(d>=10 && d<=50)
            fare=4*10+15*(d-10);
        else if(d>50)
            fare=4*10+15*40+35*(d-50);
        System.out.println("The railway fare is: "+fare);
    }
}
    
           