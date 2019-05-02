import java.io.*;
class returning
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    private int area(int s)
    {
        return s*s;
    }
    private int rect(int a, int b)
    {
        return a*b;
    }
    private double circle(double r)    
    {    
        return 2*22*r/7.0;
    }
    void display()throws IOException    
    {
         System.out.println("Please enter side of square");
         int p = Integer.parseInt(xy.readLine());
         System.out.println("The area of square is " + area(p)+".");
         
         System.out.println("Please enter length of rectangle");
         int d = Integer.parseInt(xy.readLine());
         System.out.println("Please enter breadth of rectangle");
         int e = Integer.parseInt(xy.readLine());
         System.out.println("The area of rectangle is " + rect(d,e)+".");
         
         System.out.println("Please enter radius of circle");
         int rad = Integer.parseInt(xy.readLine());
         System.out.println("The circumference of circle is " + circle(rad)+".");
    }
}