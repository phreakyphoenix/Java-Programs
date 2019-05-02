class movieMagic1
{
    int year;
    String title;
    double rate;
    movieMagic1()
    {
        year = 0;
        title = "";
        rate = 0;
    }
    movieMagic1(int y, String t, double r)
    {
        year = y;
        title = t;
        rate = r;
    }
    void displaymessage()
    {
        System.out.println("The title of the movie is "+title);
        if(0.0<=rate && rate<=2.0)
        {
            System.out.println("Flop");
        }
        if(2.1<=rate && rate<=3.4)
        {
            System.out.println("Semi-Hit");
        }
        if(3.5<=rate && rate<=4.5)
        {
            System.out.println("Hit");
        }
        if(4.6<=rate && rate<=5.0)
        {
            System.out.println("Super-Hit");
        }
    }
}
