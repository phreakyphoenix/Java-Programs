/* This program accepts a day number (between 1 an 366),
 * year (in 4 digits) to generate and Display the correct date.
 * It will also accept n from the user to dislay future date n days after generated date.
 */
import java.io.*;
class days
{
    //member variables
    int dn;
    String day1,day2;
    int year;
    int n;
    days()//default constructor
    {
        dn=0;
        year=0;
        n=0;
        day1="";
        day2="";
    }//end of constructor
    private void input()throws IOException//to input data from user
    {
        BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a day number");
        dn=Integer.parseInt(xy.readLine());
        System.out.println("enter a year in four digit");
        year=Integer.parseInt(xy.readLine());
        System.out.println("enter a number between 1 to 100");
        n=Integer.parseInt(xy.readLine());
    }//end of method input()
    private void calculate()//to generate the required dates
    {
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String m[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        if(year%400==0||year%100!=0&&year%4==0)
            a[1]=29;
        int i=0;
        while(dn>a[i])
        {
            dn=dn-a[i];
            i++;
        }//end of while loop
        day1=dn+"th "+m[i]+", "+year;
        int d=a[i]-dn;
        dn=(n>=d)?n-d:n+dn;
        i=(n>=d)?i+1:i;
        year=(i>11)?++year:year;
        i=(i>11)?i-12:i;
        while(dn>a[i])
        {
            dn=dn-a[i];
            i++;
            year=(i>11)?++year:year;
            i=(i>11)?i-12:i;
        }//end of while loop
        day2=dn+"th "+m[i]+", "+year;
    }//end of method calculate
    private void display()//to display generated data
    {
        if(1000<=year&&year<=9999&&1<=dn&&dn<=366&&1<=n&&n<=100)
        {
            if(year%400==366||year%100!=0&&year%4!=0&&dn==366)
                System.out.println("data is out of bound");
            else
            {
                calculate();
                System.out.println("The required date is: "+day1);
                System.out.println("The future date is: "+day2);
            }//end of else
        }//end of outer if
        else
            System.out.println("The data is out of bounds.");
    }//end of method display()
    void main()throws IOException//main method to call other methods
    {
        days obj=new days();
        obj.input();
        obj.display();
    }//end of main method
}//end of class

OUTPUT:
enter a day number
233
enter a year in four digit
2008
enter a number between 1 to 100
17
The required date is: 20th August, 2008
The future date is: 6th September, 2008