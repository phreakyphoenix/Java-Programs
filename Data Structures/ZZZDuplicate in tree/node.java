import java.util.Scanner;
class node
{
    Scanner sc= new Scanner (System.in);
    node left, right;
    int n;
    void input()
    {
        System.out.println("Enter number: ");
        n= sc.nextInt();
    }
    
    void dis()
    {
        System.out.println(n+" ");
    }
}