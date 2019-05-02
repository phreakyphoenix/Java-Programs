// Dislplay the product
class product
{
    void number(int n)
    {
        int s=1;
        while(n!=0)
        {
            int r=n % 10;          
            n = n/10;
            s = s*r;
        } 
        System.out.println("The product is "+s);
    }
}

