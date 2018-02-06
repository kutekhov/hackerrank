
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(isBalanced(sc.next()));
        }
    }

    public static boolean isBalanced(String example) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < example.length(); i++) {
            char temp = example.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[') {
                stack.push(temp);
            } else if (stack.empty()) return false;
            else {
                char pop = stack.pop();
                if (pop == '(' && temp != ')' || pop == '[' && temp != ']' || pop == '{' && temp != '}') return false;
            }
        }
        return stack.isEmpty();
    }

}