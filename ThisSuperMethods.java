package thisSuper;

class Parent_06 {
    void method1() {
        System.out.println("Used this() and super() in methods");
    }

    void method2() {
        //using this() to call method1
        this.method1();
    }
}
//SubClass
class Child_06 extends Parent_06 {
    void method3() {
        //using super() to call parent method
        super.method2();
    }