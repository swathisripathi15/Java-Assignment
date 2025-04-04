package Exceptions;

public class ArithmeticExceptionTryCatch {
    

        public static void main(String[] args) {
            int a = 10, b = 5, c;
            try {
                System.out.println("Inside try block");
                //below code throws divide by zero exception
                c = a / b;
                System.out.println("c = " + c);
            }
            //2. handles the Arithmetic Exception
            catch (java.lang.ArithmeticException e) {
                System.out.println("Handling the Arithmetic exception using try-catch block");
            }
    
            //1. generating Arithmetic Exception without exception handling
            c = a / b;
            System.out.println("without exception handling");
        }
    }    
