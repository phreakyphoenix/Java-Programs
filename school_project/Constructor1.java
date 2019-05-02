
import java.io.*;
public class Constructor1
{
    String name;
    double da,hra,gross,salary;
    void inputdata()throws IOException
    {
        BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter name");
        name=x.readLine();
        System.out.println("enter salary");
        salary=Double.parseDouble(x.readLine());
    }
    void calculate()
    {
        da=.15*salary;
        hra=.1*salary;
        gross=salary+da+hra;
    }
    void outputdata()
    {
        System.out.println("name"+name);
        System.out.println("salary"+salary);
        System.out.println("HRA"+hra);
        System.out.println("Gross"+gross);
        System.out.println("DA"+da);
    }
}
    