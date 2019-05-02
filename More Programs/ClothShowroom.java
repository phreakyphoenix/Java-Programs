import java.util.Scanner;
class ClothShowroom
{
    public void compute()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter amount of purchase: ");
        double p=in.nextDouble(),d=0.0,na;
        System.out.println("Enter 1 for Mill Cloth.");
        System.out.println("Enter 2 for handloom textiles.");
        int c=in.nextInt();
        switch(c)
        {
            case 1:
            if(p<1000)
                d=0.02*p;
            else if(p>=1001&& p<=5000)
                d=0.2*p;
            else if(p>=5001 && p<10000)
                d=0.4*p;
            else if(p>=10001)
                d=0.5*p;
            break;
            case 2:
            if(p<1000)
                d=0.05*p;
            else if(p>=1000 && p<=5000)
                d=0.25*p;
            else if(p>=5001 && p<10000)
                d=0.5*p;
            else if(p>=10000)
                d=0.6*p;
            break;
            default:
            System.out.println("Wrong Input!!!!");
        }
        
            na=p-d;
            System.out.println("The discount is: "+d);
            System.out.println("The net amount paid is: "+na);
    }
}
        