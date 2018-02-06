
import java.util.Scanner;

public class JavaSubarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int negativeCount = 0;
        for (int i = 0; i < array.length; i++) {
            int summ = 0;
            for (int j = i; j < array.length; j++) {
                summ += array[j];
                if (summ < 0) negativeCount++;
            }
        }
        System.out.println(negativeCount);
    }

}