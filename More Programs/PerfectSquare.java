import java.util.Scanner;
class PerfectSquare
{
    public void display()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter numbers to be checked for perfect square: ");
        int n=1;
        while(n!=0)
        {
            n=in.nextInt();
            int r=(int)Math.sqrt(n);
            int sq=r*r;
            if(n==sq)
                System.out.println(n+" is a Perfect Square.");
            else
                System.out.println(n+" is not a Perfect Square.");
        }
    }
}
