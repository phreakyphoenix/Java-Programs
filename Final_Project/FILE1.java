/**
 * WRITE A PROGRAM TO READ FROM A DATA FILE CREATED BY
 * A SHOP OF ITS DIALY TRANSACTION AND PRINT THE DETAILS
 * OF ONE DAYS TRANSACTION. 
 */


import java.io.*;
class FILE1
{
    void write()throws IOException
    {
         BufferedReader xy = new BufferedReader(new InputStreamReader(System.in)); 
         FileOutputStream fout=new FileOutputStream("d:/customer.dat");
         DataOutputStream d=new DataOutputStream(fout);
         int n=0;
         System.out.println("enter shop name");
         String shop=xy.readLine();
         d.writeUTF(shop);
         do
         {
             System.out.println("1.continue \t 2.exit");
             n=Integer.parseInt(xy.readLine());
             if(n==1)
             {
               System.out.println("enter customer number"); 
               int i=Integer.parseInt(xy.readLine());
               System.out.println("enter the item"); 
               String s=xy.readLine();
               System.out.println("enter price of item"); 
               double p=Double.parseDouble(xy.readLine());
               d.writeInt(i);
               d.writeUTF(s);
               d.writeDouble(p);
             }
         }while(n!=2);
         d.close();
         fout.close();    
    }
    void read()
    {
        try
        {
             FileInputStream fn=new FileInputStream("d:/customer.dat");
             DataInputStream d=new DataInputStream(fn);
             int sum=0;
             System.out.println("Shop name:-"+d.readUTF());
             System.out.println("Daily transaction report");
             System.out.println("cust no. \t item \t price");
             while(true)
             {
                 try
                 {
                     int i=d.readInt();
                     String s=d.readUTF();
                     double p=d.readDouble();
                     System.out.println(i+"\t\t"+s+"\t\t"+p);
                     sum+=p;
                 }
                 catch(EOFException e)
                 {
                     System.out.println("\t\t\tTOTAL\t"+sum);
                     break;
                 }
             }
             d.close();
             fn.close();
        }
        catch(Exception e)
        {
            System.out.println("file not found");
        }
    }
    void main()throws IOException
    {
        write();
        read();
    }
}


/**OUTPUT
   enter shop name
   Shudha Stationary
   1.continue 	 2.exit
   1
   enter customer number
   1
   enter the item
   pen
   enter price of item
   200
   1.continue 	 2.exit
   1
   enter customer number
   1
   enter the item
   paper
   enter price of item
   300
   1.continue 	 2.exit
   1
   enter customer number
   1
   enter the item
   ink
   enter price of item
   300
   1.continue 	 2.exit
   1
   enter customer number
   2
   enter the item
   pen
   enter price of item
   400
   1.continue 	 2.exit
   1
   enter customer number
   2
   enter the item
   ink
   enter price of item
   300
   1.continue 	 2.exit
   1
   enter customer number
   3
   enter the item
   pen
   enter price of item
   200
   1.continue 	 2.exit
   1
   enter customer number
   2
   enter the item
   paper
   enter price of item
   150
   1.continue 	 2.exit
   2
   Shop name:-Shudha Stationary
   Daily transaction report
   cust no.     item 	price
   1		    pen		200.0
   1		    paper	300.0
   1		    int		300.0
   2		    pen		400.0
   2		    ink		300.0
   3		    pen		200.0
   2		    paper	150.0
			   TOTAL	1850
 */





/**
 * NAME     TYPE       DESCRIPTION
 * n        int     -  to store user's choice
 * i        int     -  to customer number
 * s        Stirng  -  to store item purchased
 * p        int     -  to store price of item
 * sum      int     -  to store total daily transaction amount
 */