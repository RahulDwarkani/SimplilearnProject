package SimplilearnProjectWork;



class MyException extends Exception {
    private static final long serialVersionUID = 1L;
    public MyException(String s){
        super(s);
    }
}

public class CustomException {

    public static void main(String[] args) {
        try {
            try {
                int number = 5 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception caught");
            }
            try {
                String str = null;
                str.length();
            } catch (NullPointerException e) {
                System.out.println("Array exception caught");
            }
            try {
                throw new MyException("custom Exception created");
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Custom Exception caught");
            }
        } catch (Exception e) {
            System.out.println("This exception should never execute");
        }
        finally {
            System.out.println("All Exception Caught successfully");
        }
    }
}
