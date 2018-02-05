
import java.util.Scanner;

public class JavaLoops2  {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                int temp = a;
                for (int q = 0; q <= j; q++) {
                    temp = temp + (int) (Math.pow(2, q) * b);
                }
                arr[j] = temp;
            }
            for (int j = 0; j < n; j++)
                System.out.print(arr[j] + " ");

            System.out.println();
        }
        in.close();
    }
}