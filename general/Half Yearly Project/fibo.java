//Ths program displays all fibonacci numbers upto 21.

class fibo
{
    int x,y,z;
    fibo()
    {
        x=1;    y=0;    z=0;
    }

    void lp()
    {
        System.out.println(z);
        z=x+y;
        x=y;
        y=z;
        if(z<21)
            lp();
    }
}

OUTPUT:
0
1
1
2
3
5
8
13
