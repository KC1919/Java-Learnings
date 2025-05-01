class A {
    public void show(){
        System.out.println("Hello from class A");
    }
    public void display(){
        System.out.println("Hello from class A display method");
    }
}

class B extends A {
    public void show(){
        System.out.println("Hello from class B");
    }
}


public class abc {
    public static void main(String[] args) {
        // dynamic dispatch/ runtime polymorphism
        A obj=new B(); // irrespective of the reference class, the class for which the object is initialised its method is called
        obj.show(); // in this case class B show method will be called, irrespective of class reference of A
        obj.display();
    }
}


