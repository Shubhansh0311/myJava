public class Bitmanupulations {
    public static void main(String[] args) {
        int n=5;
    int pos=2;
    //bitmask for set bit
int  bitMask=1<<pos;
int newnumber=bitMask|n;
System.out.println(newnumber);
//bitmask for get bit
int newnumber_1=bitMask&n;
System.out.println(newnumber_1);
//bitmask for clear bit
int notBitmask=~bitMask;
int newnumber_3=notBitmask&n;
System.out.println(newnumber_3);
//update bit to 1
 bitMask=1<<pos;
newnumber=bitMask|n;
System.out.println(newnumber);
//update to 
notBitmask=~bitMask;
 newnumber_3=notBitmask&n;
System.out.println(newnumber_3);
    }
}
