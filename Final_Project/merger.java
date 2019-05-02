import java.io.*;
class merger
{
    BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    long n1,n2,mergernum;
    merger()//default constructor
    {
        n1=0;
        n2=0;
        mergernum=0;
    }//end of default constructor
    void readnum() throws IOException
    {
        System.out.println("Enter numbers");
        n1=Long.parseLong(xy.readLine());
        n2=Long.parseLong(xy.readLine());
    }//end of function readnum
    void joinnum()
    {
        String s1=String.valueOf(n1);
        String s2=String.valueOf(n2);
        String s3=s1.concat(s2);
        mergernum=Long.parseLong(s3);
    }//end of function joinnum
    void show()
    {
        System.out.println("Original members are "+n1+","+n2);
        System.out.println("Merged number is "+mergernum);
    }//end of function show
    void main() throws IOException
    {
        merger obj =new merger();
        obj.readnum();
        obj.joinnum();
        obj.show();
    }//end of method
}//end of class

OUTPUT:
Enter numbers
25
35
Original members are 25,35
Merged number is 2535