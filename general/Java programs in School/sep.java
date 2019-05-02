//no of times a digit occurs in no.
class sep
{
    void number(int n,int x)
    {
        int s=0;
        System.out.println('\t'+s);
        while(n!=0)
        {
            int r=n % 10;          
            n = n/10;
            if(r==x)
            s++;            
        }
        if(s>0)
        System.out.println("The no of times the digit "+x+" occurs in the number is "+s);
        else
        System.out.println("The didit "+x+" is not present in the numner");   
    }
        
 }