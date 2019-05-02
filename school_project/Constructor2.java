

public class Constructor2
{
    int a;
    int b;
    void accept(int x,int y)
    {
        a=x;
        b=y;
    }
    int calc()
    {
        int s=a+b;
        return s;
    }
    void display()
    {
        int c=calc();
        System.out.println("first number"+a);
        System.out.println("second number"+b);
        System.out.println("the sum is"+c);
    }
}