class Pens{
    String color;
    public void print(String col){
       this.color=col;
        System.out.println(color);
        }
    
}

    
public class Objects {
    
    public static void main(String args[]){
        Pens p=new Pens();
        p.print("red");
        Pens p1=new Pens();
        p1.print("green");
        //Pens p2=new Pens();p2.color=;
       // p2.print();
        Pens p3=new Pens();p3.color="orange";
        //p3.print();
        Pens p4=new Pens();p4.color="white";
        //p4.print();
            }
        }
        

