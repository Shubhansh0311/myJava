public class Construct {
    
        String name;
            int age=13;
            Construct(String name){
                this.name=name;}//this is used for creating link
                public void display(){System.out.println("constructors called"+" "+ name);
            }
            public static void main(String args[])
        

    {
        Construct c1=new Construct("shubh");
        Construct c2=new Construct("shubhansh");
        c1.display();
        c2.display();
    }
}
