
import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        BitSet set1 = new BitSet(length);
        BitSet set2 = new BitSet(length);
        int operNum = sc.nextInt();
        for (int i = 0; i < operNum; i++) {
            String operation = sc.next();
            int f1 = sc.nextInt();
            int f2 = sc.nextInt();
            switch (operation) {
                case "AND": {
                    if (f1 == 1) {
                        set1.and(set2);
                    } else set2.and(set1);
                    System.out.println(set1.cardinality() + " " + set2.cardinality());
                    break;
                }
                case "SET": {
                    if (f1 == 1) {
                        set1.set(f2);
                    } else set2.set(f2);
                    System.out.println(set1.cardinality() + " " + set2.cardinality());
                    break;
                }
                case "FLIP": {
                    if (f1 == 1) {
                        set1.flip(f2);
                    } else set2.flip(f2);
                    System.out.println(set1.cardinality() + " " + set2.cardinality());
                    break;
                }
                case "XOR": {
                    if (f1 == 1) {
                        set1.xor(set2);
                    } else set2.xor(set1);
                    System.out.println(set1.cardinality() + " " + set2.cardinality());
                    break;
                }
                case "OR": {
                    if (f1 == 1) {
                        set1.or(set2);
                    } else set2.or(set1);
                    System.out.println(set1.cardinality() + " " + set2.cardinality());
                    break;
                }
            }
        }
        sc.close();
    }

}