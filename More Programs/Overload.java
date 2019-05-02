import java.util.Scanner;
class Overload
{
    Scanner in=new Scanner(System.in);
    double pp,di,di1,di2,a;
    int d,d1,d2;
    public void Discount(int d)
    {
        System.out.println("Enter printed price: ");
        pp=in.nextDouble();
        di=pp*d/100.0;
        a=pp-di;
        System.out.println("Amount to be paid is: "+a);
    }
    public void Discount(int d,int d1)
    {
        System.out.println("Enter printed price: ");
        pp=in.nextDouble();
        di=pp*d/100.0;
        di1=(pp-di)*d1/100.0;
        a=pp-di-di1;
        System.out.println("Amount to be paid is: "+a);
    }
    public void Discount(int d, int d1, int d2)
    {
        System.out.println("Enter printed price: ");
        pp=in.nextDouble();
        di=pp*d/100.0;
        di1=(pp-di)*d1/100.0;
        di2=(pp-di-di1)*d2/100.0;
        a=pp-di-di1-di2;
        System.out.println("Amount to be paid is: "+a);
    }
}
        