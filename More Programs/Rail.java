import java.io.*;
class Rail
{   
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException
    {
        System.out.println("Enter 1 for railway fare of below 10 years age.");
        System.out.println("Enter 2 for railway fare of age between 10 and 60 years.");
        System.out.println("Enter 3 for railway fare if above 60 years age.");
        int c=Integer.parseInt(xy.readLine());
        System.out.println("Enter distance travelled: ");
        double d=Double.parseDouble(xy.readLine());
        double fare=0;
        switch(c)
        {
            case 1:
            if(d<10)
                fare=5*d;
            else if(d>=10 && d<=50)
                fare=5*10+20*(d-10);
            else if(d>50)
                fare=5*10+20*40+50*(d-50);
            System.out.println("The railway fare is: "+fare);
            break;

            case 2:
            if(d<10)
                fare=10*d;
            else if(d>=10 && d<=50)
                fare=10*10+40*(d-10);
            else if(d>50)
                fare=10*10+40*40+80*(d-50);
            System.out.println("The railway fare is: "+fare);
            break;

            case 3:
            if(d<10)
                fare=4*d;
            else if(d>=10 && d<=50)
                fare=4*10+15*(d-10);
            else if(d>50)
                fare=4*10+15*40+35*(d-50);
            System.out.println("The railway fare is: "+fare);
            break;

            default:
            System.out.println("Wrong Input");
        }
    }
}

           