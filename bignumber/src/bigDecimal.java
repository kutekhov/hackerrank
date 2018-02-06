
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bigDecimal {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        Arrays.sort(s, 0, n, Collections.reverseOrder((o1, o2) -> {
            BigDecimal a = new BigDecimal(o1);
            BigDecimal b = new BigDecimal(o2);
            return a.compareTo(b);
        }));
        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}