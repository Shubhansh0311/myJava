import java.util.jar.Attributes.Name;

class Student{
   static  String teacher;
static String name;
static{
    teacher="swayam";
    name="my name";
    System.out.println("static class");
}
Student(){System.out.println("constructor called");
}

public void show(){
    System.out.println(teacher+ " : "+name);
}
}
public class StaticKeyword {
    static int i=0;
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        i=1;
        s1.show();
        s2.show();
     
      //  Student.teacher="mohan";
      
        //s2.name="shubh";
       //s2.teacher="ram";
        //s2.teacher="raman"; 
       // Student.teacher="shyam";
       // s1.show();
       // s2.show();
    
        System.out.println(i);
     
    }
}
