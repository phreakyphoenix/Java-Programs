import java.util.Scanner;
class mergeArray
{
    int a1[],a2[],a3[];
    int s1,s2,s3;
    
    public mergeArray()
    {
        s1=0;s2=0;s3=0;
    }

    public void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Size of the first array: ");
        s1=sc.nextInt();
        System.out.println("Size of the second array: ");
        s2=sc.nextInt();
        a1=new int[s1];
        a2=new int[s2];
        a3=new int[s1+s2]; 
        System.out.println("Enter data into first array");
        for(int i=0;i<s1;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter data into second array");
        for(int i=0;i<s2;i++)
        {
            a2[i]=sc.nextInt();
        }
    }

    public void sort(int p[])
    {
        int i, j, tmp ;
        for(i = 0 ; i < p.length-1 ; i++)
        {
            for( j = 0 ; j < (p.length - i-1 )  ; j++)
            {
                if(p[j] > p[ j + 1 ])
                {
                    tmp = p[j] ;
                    p[j] = p[ j + 1] ;
                    p[ j + 1] = tmp ; 
                }
            }
        } 
    }
    
    public void merge()
    {
        sort(a1);
        sort(a2);
        int i=0,j=0,k=0;
        while(i<a1.length && j<a2.length)
        {
            if(a1[i]<((a2[j])))
            {
                a3[k++]=a1[i++];
            }
            else
            {
                a3[k++]=a2[j++];
            }
        }

        while(i<a1.length)
            a3[k++]=a1[i++];
        while(j<a2.length)
            a3[k++]=a2[j++];
        System.out.print("The merged array is: ");
        display(a3);
    }

    public void display(int p[])
    {
        for(int i =0;i<p.length;i++)
            System.out.print(p[i]+"\t");
    }

    public void main()
    {
        mergeArray obj= new mergeArray();
        obj.input();
        obj.merge();
    }
}

OUTPUT:
Size of the first array: 
5
Size of the second array: 
3
Enter data into first array
89
56
3
45
78
Enter data into second array
5
45
67
The merged array is: 3	5	45	45	56	67	78	89
