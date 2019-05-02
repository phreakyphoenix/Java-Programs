class armstrong
{
       void display(int x)
       {   int s=0,r;
           for(int n=1;n<=x;n++)
              {
               int c=n;
                while(n!=0)
                {
                    r=n%10;
                    n=n/10;
                    s=s+(r*r*r);
               }
              if(s==c)
              { 
                  System.out.println(c+" is Armstrong");
              }
          
           }
       }
}    

