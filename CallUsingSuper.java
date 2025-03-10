package thisSuper;

class Parent_02_05 {
    String name = "Swathi";

    Parent_02_05() {
        System.out.println("This is parent class constructor");
    }
}

//SubClass
class Child_02_05 extends Parent_02_05 {
    String name = "Jala";

    Child_02_05() {
        //5. Calling constructor of the parent class using super()
        super();
        System.out.println("This is child class constructor");
    }

    void myMethod() {
        //Printing fields of the parent class using super
        System.out.println("My name is " + super.name);
    }
}

public class CallUsingSuper {
    public static void main(String[] args) {
        Child_02_05 c = new Child_02_05();
        c.myMethod();
    }
}