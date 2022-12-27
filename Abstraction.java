abstract class Animal{
    public void display2(){System.out.println("this is animal class");}
}
class Cat extends Animal{
    public void display(){System.out.println("this is cat class");}
}

class Dog extends Cat{
    public void display1(){System.out.println("this is dog class");}
}


class Inheritance extends Animal {
    public static void main(String args[]){
Dog a= new Dog();
a.display();
a.display2();
a.display1();

    }
    }
public class Abstraction {
    }
