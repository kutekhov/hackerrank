
import java.util.Scanner;

public class Java1DArrayPart2{

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return canSolve(leap, game, 0);
    }

    public static boolean canSolve(int leap, int[] game, int cur) {
        if (cur < 0 || game[cur] == 1) return false;
        if (cur >= game.length - 1 || cur + leap > game.length - 1) return true;
        game[cur] = 1;
        return canSolve(leap, game, cur + 1) || canSolve(leap, game, cur - 1) || canSolve(leap, game, cur + leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }

}