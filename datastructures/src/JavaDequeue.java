
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDequeue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (i + 1 >= m) {
                set.add(num);
                deque.add(num);
                max = set.size() > max ? set.size() : max;
                int removed = (int) deque.pollFirst();
                if (!deque.contains(removed)) set.remove(removed);

            } else {
                set.add(num);
                deque.add(num);
            }
        }
        System.out.println(max);
    }
}