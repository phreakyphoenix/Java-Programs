import java.util.Scanner;
class IncomeTax
{
    public void display()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter anual gross income: ");
        double ai=in.nextDouble(),at=0;
        if(ai<=100000)
            at=0;
        else if(ai>=100001 && ai<=500000)
            at=1000+0.1*(ai-100000);
        else if(ai>=500001 && ai<=800000)
            at=5000+0.2*(ai-500000);
        else if(ai>800000)
            at=10000+0.3*(ai-800000);
        System.out.println("The annual tax deduction is: "+at);
    }
}