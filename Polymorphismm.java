import javax.print.attribute.standard.PrinterInfo;

public class Polymorphismm {
    String name;
    int age;
    public void printinfo(){
  
        System.out.println(age);}
        public void printinfo(int a){
            this.age=a;
            System.out.println(age);}
            public void printinfo(int a,int b){
                this.age=b;
                System.out.println(age);}
                public void printinfo(char a){
                    System.out.println(age);}
                    public void printinfo(int age,char a){
                        System.out.println(age);}

                        public static void main(String arg[])
                        {
Polymorphismm p=new Polymorphismm();
int age=19;
p.printinfo(19);
p.printinfo('a');
p.printinfo(19,'a');
p.printinfo(19,13);
                        }
    }
    

