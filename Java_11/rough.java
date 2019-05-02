class rough
{
    void rough(int counter)
    {
        if(counter ==0)
        System.out.println(" ");
        else
        {
            System.out.println("Hello"+counter);
            rough(--counter);
            System.out.println(""+counter);
        }
    }
}

    