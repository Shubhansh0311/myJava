public class Bubblesort {
    public static void main(String args[]) {
        int i ,j,a[]={11,55,64,8,2,46,-3,22,558,100};
        for(i=0;i<a.length-1;i++){
            for(j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
