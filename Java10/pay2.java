import java.io.*;
class pay2
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    String name;
    double salary,da,hra,gross;
    void inputdata()throws IOException
    {
        System.out.println("Please enter your name");
        name=xy.readLine();
        System.out.println("Please enter your salary");
        salary = Double.parseDouble(xy.readLine());
    }
    double calculate()
    {
        da=15*salary/100.0;
        hra=10*salary/100.0;
        return salary+da+hra;
    }
    void outputdata()
    {
        System.out.println("your name: "+name);        
        System.out.println("your salary: "+salary);
        System.out.println("your da: "+da);
        System.out.println("your hra: "+hra);
        System.out.println("your gross salary: "+calculate());
    }
}
