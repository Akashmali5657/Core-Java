package ExceptionHandling;
/*
The throw and throws is the concept of exception handling where the throw keyword throw the exception explicitly
from a method or a block of code whereas the throws keyword is used in signature of the method.
 */
public class TestThrow {
    public static void checkNum(int num) {
        if (num < 1) {
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");
        }
        else {
            System.out.println("Square of " + num + " is " + (num*num));
        }
    }
    //main method
    public static void main(String[] args) {
        TestThrow obj = new TestThrow();
        System.out.println("Program Start");
        obj.checkNum(-3);
        System.out.println("Program end");
    }
}