class movieMagic2
{
    int year;
    String title;
    double rate;
    movieMagic2()
    {
        year = 0;
        title = "";
        rate = 0;
    }
    movieMagic2(int y, String t, double r)
    {
        year = y;
        title = t;
        rate = r;
    }
    void displaymessage()
    {
        System.out.println("The title of the movie is "+title);
        if(0.0<=rate)
        {
            if(2.1<=rate)
            {
                if(3.5<=rate)
                {
                    if(4.6<=rate)
                    {
                         System.out.println("Super - Hit"); 
                    }
                    System.out.println("Hit"); 
                }
                 System.out.println("Semi - Hit");
            }
            System.out.println("Flop");
        }        
    }
}
