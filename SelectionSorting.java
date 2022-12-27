public class SelectionSorting {
    public static void main(String args[]){
        int i,j,a[]={1,6,4,5,3,9,7,8,2};
        for(i=0;i<a.length-1;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]>a[j])
                {int temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
    }
            }
        }
        for (i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
      
        }
    }
    
}
