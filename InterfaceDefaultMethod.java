package Interfaces;

interface Jala_06 {
    //default method
    default void defaultMethod() {
        System.out.println("This is a default method");
    }
}

class InterfaceDefaultMethod implements Jala_06 {
    public static void main(String[] args) {
        //Didn't provide implementation to the default method
        InterfaceDefaultMethod if6 = new InterfaceDefaultMethod();
        //Calling the method
        if6.defaultMethod();
    }
}