public class Insertionsort {
    public static void main(String args[])
{int arr[]={9,8,7,6,5,4,3,2,1,10};
int i,j,current;
for(i=0;i<arr.length-1;i++){
current=arr[i];
    j=i-1;
    while(j>=0&&arr[j]>current){
        arr[j+1]=arr[j];
        j--;}
        arr[j+1]=current;}

    
    for(i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");}
}
}




  

