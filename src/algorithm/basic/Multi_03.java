package algorithm.basic;

public class Multi_03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i == 1) {
                System.out.print("   |");
            }
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("---+---------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "  |");
            for (int j = 1; j <=9; j++) {
                System.out.printf("%3d", i + j);
            }
            System.out.println();
        }
    }
}
