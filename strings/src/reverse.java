
import java.io.*;
import java.util.*;

public class reverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A);
        if (sb.toString().equals(sb.reverse().toString())){


            System.out.println("Yes");
        }else System.out.println("No");
    }
}
