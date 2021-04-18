package Exception;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;

class Throwmethod
        {
            void method() throws ArithmeticException {
                throw new ArithmeticException("Device error");
            }

        }


public class ThrowsException {

    public static void main(String[] args) {
        try{
            Throwmethod m = new Throwmethod();
            m.method();
        }catch (NullPointerException e){
            System.out.println("Exception Handled" + e.getMessage());
        }
    }
}
