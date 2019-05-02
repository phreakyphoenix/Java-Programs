import java.io.*;
class magic
{
    int m,n;
    BufferedReader xy=new BufferedReader(new InputStreamReader(System.in));
    magic()
    {
        m=0;n=0;
    }

    private void accept()throws IOException
    {
        System.out.println("Enter first number, between 100 and 10000");
        m=Integer.parseInt(xy.readLine());
        System.out.println("Enter second number, positive but less than 100");
        n=Integer.parseInt(xy.readLine());
    }

    private boolean validity()
    {
        if(m>=100&& m<=10000)
            if(n>0&&n<100)
                return true;
        return false;
    }

    private boolean check(int num)
    {
        int s=0;
        while(num!=0)
        {
            int r=num%10;
            num=num/10;
            s=s+r;
        }
        if(s==n)
            return true;
        return false;
    }

    public void main()throws IOException
    {
        magic obj = new magic();
        obj.accept();
        if (obj.validity()==false)
            System.out.println("Invalid input");
        else
        {
            for(int i=obj.m;;i++)
            {
                if(obj.check(i)==true)
                {
                    System.out.println("The required number= "+i);
                    System.out.println("Total number of digits= "+String.valueOf(i).length());
                    break;
                }
            }
        }
    }
}