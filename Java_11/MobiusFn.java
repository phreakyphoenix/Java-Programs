import java.io.*;
class MobiusFn
{
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    int n;
    MobiusFn()
    {
        n = 0;
    }

    void input() throws IOException
    {
        System.out.print("Enter a  number: ");
        n = Integer.parseInt(xy.readLine());
    }

    int primeFac()
    {
        int f=0, copy = 0;
        for(int i=2; i<=n;i++)
        {
            if(n%i==0)
            {
                f++;
                if(copy==i)
                    return 0;
                else 
                    copy=i;
                n=n/i;
                i=1;
            }
        }
        return f;
    }

    void display()
    {
        int mob,p;
        if(n == 1)
            mob = 1;
        else
        {
            p = primeFac();
            if(p == 0) 
                mob = 0;
            else 
                mob = (int)Math.pow(-1,p);
        }
        System.out.println(mob);
    }

    void main()throws IOException
    {
        MobiusFn obj = new MobiusFn();
        obj.input();
        obj.display();
    }
}
