package ExceptionHandling;
/*
The throw and throws is the concept of exception handling where the throw keyword throw the exception explicitly from a
method or a block of code whereas the throws keyword is used in signature of the method.
 */
public class TestThrows {
    public static int divideNum(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;
    }
    //main method
    public static void main(String[] args) {
        TestThrows obj = new TestThrows();
        try {
            System.out.println(obj.divideNum(45, 0));
        }
        catch (ArithmeticException e){
            System.out.println("\nNumber cannot be divided by 0");
        }
    }
}