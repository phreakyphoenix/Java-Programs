import java.io.*;
class Employee
{
    int code;
    String name, address;
    double basicsalary,netsalary,DA,HRA,PF,IT,grosssalary;

    public void accept()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.print ("Enter employee code : ");
        code=Integer.parseInt(in.readLine());
        System.out.print ("Enter employee name : ");
        name=in.readLine();
        System.out.print ("Enter address : ");
        address=in.readLine();
        System.out.print ("Enter basic salary : ");
        basicsalary=Double.parseDouble(in.readLine());
    }

    public void compute()
    {
        DA=0.55*basicsalary;
        HRA=0.2*basicsalary;
        PF=1000;
        grosssalary=DA+HRA+basicsalary;
        IT=0.02*grosssalary;
        netsalary=grosssalary-IT-PF;
    }

    public void display()
    {
        System.out.println("Emplyee code : "+code);
        System.out.println("The basicsalary of emplyee is : "+basicsalary);
        System.out.println("The DA of emplyee is : "+DA);
        System.out.println("The HRA of emplyee is : "+HRA);
        System.out.println("The PF of emplyee is : "+PF);
        System.out.println("The grosssalary of emplyee is : "+grosssalary);       
        System.out.println("The IT of emplyee is : "+IT);
        System.out.println("The netsalary of emplyee is : "+netsalary);
    }
}
