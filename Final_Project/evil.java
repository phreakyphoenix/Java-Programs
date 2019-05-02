//This program checks whether a number is evil or not.
import java.io.*;
class evil
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    void check()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Number: ");
        int n=Integer.parseInt(br.readLine());
        int newno=0,c=0,d=0;
        while(n!=0)
        {
            int r=n%2;
            if(r==1)d++;                                   //FINDS NUMBER OF 1 IN BINARY
            n/=2;
            newno=r*(int)Math.pow(10,c)+newno;
            c++;
        }
        System.out.println("Binary: "+newno);
        if(d%2==0)
        System.out.println("Evil Number");
        else
        System.out.println("Not an Evil Number");
    }
}

OUTPUT:
Enter the Number: 15
Binary: 1111
Evil Number

