package static_poly;

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
    public void display(String str){
        System.out.println("Display: "+str);
    }
}

public class demo {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
        obj.display("Movies"); // compile time/static polymorphism, gets to know at compile-time via the method signature
                                   // that which method to execute
    }
}
