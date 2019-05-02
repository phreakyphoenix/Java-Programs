import java.util.Scanner;
class Name
{
    public void display()
    {
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name");
        String n=in.nextLine();
        String str="";
        for(i=0;i<n.length();i++)
        {
            if(n.charAt(i)==' ')
                str=n.substring(0,i)+" Kumar "+n.substring(i+1);
        }
        System.out.println("The full name is: "+str);
    }
}