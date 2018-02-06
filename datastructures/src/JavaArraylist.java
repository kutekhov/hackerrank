
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int n = sc.nextInt();
            List<Integer> tempList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                tempList.add(sc.nextInt());
            }
            list.add(tempList);
        }
        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if (x >= list.size() || y >= list.get(x).size()) System.out.println("ERROR!");
            else System.out.println(list.get(x).get(y));
        }
    }


}