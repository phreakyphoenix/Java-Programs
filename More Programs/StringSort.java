class StringSort
{
    public void display(String s)
    {
        String ar[]=new String [250];
        s=s+" ";
        int i,j,l=s.length(),c=0;
        String w="",tmp="";
        char ch;
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
                w=w+ch;
            else
            {
                ar[c]=w;
                c++;
                w="";
            }
        }
        for(i=0;i<c-1;i++)
        {
            for(j=i+1;j<c;j++)
            {
                if(ar[i].compareTo(ar[j])>0)
                {
                    tmp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=tmp;
                }
            }
        }
        for(i=0;i<c;i++)
            System.out.print(ar[i]+" ");
    }
}