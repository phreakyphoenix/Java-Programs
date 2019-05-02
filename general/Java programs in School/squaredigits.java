// Dislplay the sum of the square of the digits
class squaredigits
{
    void number(int n)
    {
        int s=0;
        while(n!=0)
        {
            int r=n % 10;          
            n = n/10;
            s = s+(r*r);
        }
        System.out.println("The sum of square of digits is " +s);
    }
        
 }
