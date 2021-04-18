package Exception;

public class JavException {

    public static void main(String[] args) {
        try {
            int i=5/5;
        }catch(ArithmeticException e) {
            System.out.println("Exception Catched");
        } finally {
            System.out.println("Mandatory Field to Execute");
        }
    }
}
