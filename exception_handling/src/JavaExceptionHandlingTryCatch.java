import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaExceptionHandlingTryCatch {
    public static void main( String args[] ) {
        BufferedReader br = null;

        try {

            br = new BufferedReader(new InputStreamReader(System.in));
            int l1 = Integer.parseInt(br.readLine());
            int l2 = Integer.parseInt(br.readLine());

            System.out.println( l1 / l2 );

        } catch( IOException e ) {
            e.printStackTrace();
        } catch( NumberFormatException e ) {
            System.out.println("java.util.InputMismatchException");
        } catch( ArithmeticException e ) {
            System.out.println(e.toString());
        }
    }
}


