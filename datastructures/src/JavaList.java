
import java.util.LinkedList;
        import java.util.List;
        import java.util.Scanner;

public class JavaList{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            list.add(sc.nextInt());
        }
        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            String command = sc.next();
            if (command.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x, y);
            } else {
                int x = sc.nextInt();
                list.remove(x);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

}