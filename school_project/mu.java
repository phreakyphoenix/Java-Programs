

class mu
{
void display(int n)
{
int c=0;
int r;
int d=0;
while(c<10)
{
for(int i=n;i!=0;i=i/10)
{


 r=i%10;
if(r==c)
{
d++;
}
}
System.out.println("no.of times "+c+"is present="+d);
d=0;
c++;
}
}
}
