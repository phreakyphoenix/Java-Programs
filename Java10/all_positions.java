class all_positions
{
    void main(String s)
    {
        int l=s.length();
        int p = 0;
        for(int i=0;i<l;i++)
        {
            p=s.indexOf('A',p);
            if(p<0)
            break;
            System.out.println(p);
            p++;
        }
    }
}
