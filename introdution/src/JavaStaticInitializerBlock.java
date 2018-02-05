
import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        B = Integer.parseInt(sc.next());
        H = Integer.parseInt(sc.next());
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
        sc.close();
    }
}