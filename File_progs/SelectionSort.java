class SelectionSort{ 
    public static void main(String args[]){ 
        int a[]={92, 34, 78, 12, 45, 7, 81, 60, 51, 10}; 
        int i, j, temp, pos; 
        for(i=0;i<9;i++)
        { 
            pos=i; 
            for(j=i+1;j<10;j++)
            { 
                if(a[j]<a[i])
                { 
                    pos=j; 
                } 
            } 
            temp=a[i]; 
            a[i]=a[pos]; 
            a[pos]=temp; 
        } 
        for(i=0;i<a.length;i++) 
            System.out.print(a[i]+"\t"); 
        System.out.println(); 
    } 
} 