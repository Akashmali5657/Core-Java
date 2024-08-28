package ExceptionHandling;

public class CustomException {
    public static void main(String[] args) {
        int a =10;
        if(a>9){
            try {
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
        System.out.println("Yes, Finished");
    }
}

