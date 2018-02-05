import java.io.*;
import java.util.*;


public class anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] a1 = a.toLowerCase().toCharArray();
        char[] b1 = b.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        if (Arrays.toString(b1).equals(Arrays.toString(a1))) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
