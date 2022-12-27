class Copy{
    String name;
    int age;;
    Copy(){
this.name=name;
this.age=age;
    }
    Copy(Copy c2){
        this.name=c2.name;
        this.age=c2.age;
        System.out.println("copy constructors\t"+name);
        System.out.println("copy constructors\t"+age);
  

    }
}
public class CopyConstructors {
public static void main(String args[]){
    //Copy c=new Copy();
    Copy c1=new Copy();
    c1.name="naman";
    c1.age=500;
    //Copy c=new Copy();
Copy c2=new Copy(c1);
}
    
}
