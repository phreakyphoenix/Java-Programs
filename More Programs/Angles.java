import java.util.Scanner;
class Angles
{
    public void trigonometry()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter an angle in degrees: ");
        double a=in.nextDouble();
        double r=a*(22/7)/180;
        System.out.println("Enter 1 for sine value.");
        System.out.println("Enter 2 for cosine value.");
        System.out.println("Enter 3 for tangent value.");
        System.out.println("Enter your choice: ");
        int c=in.nextInt();
        switch(c)
        {
            case 1:
            double sin=Math.sin(r);
            System.out.println("The sine value of "+a+" is: "+sin);
            break;
            case 2:
            double cos=Math.cos(r);
            System.out.println("The cosine value of "+a+" is: "+cos);
            break;
            case 3:
            double tan=Math.tan(r);
            System.out.println("The tangent value of "+a+" is: "+tan);
            break;
            default:
            System.out.println("Wrong input!!!");
        }
    }
}

        