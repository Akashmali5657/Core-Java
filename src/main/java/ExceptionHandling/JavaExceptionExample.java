package ExceptionHandling;

/*
1. The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors
so that the normal flow of the application can be maintained.
2.Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException,
SQLException, RemoteException, so on.
3.It will not spot execution of code, continuously it will run cod till end
 */
public class JavaExceptionExample {
    public static void main(String[] args) {

        // Normal code with exception handling
        System.out.println(" Programs start");
        int myArray[] = {3, 9, 45, 22, 16};
//        System.out.println(myArray[3]);
//        System.out.println("programs end");

        //--with exception handling
        try {
            int result = myArray[1] / 0;
            System.out.println(myArray[20]);        //ArrayIndexOutOfBoundsException
        }
        // handling the exception
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Beyond scope : " + e);
        } finally {
            System.out.println("The finally block always executed");
        }

        //general way to handle exception
        try {
            String name = null;
            System.out.println(name.length());
        } catch (Exception exception) {
            System.out.println(exception);
        }
        System.out.println("programs end");
    }
}