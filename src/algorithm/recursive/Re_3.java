package algorithm.recursive;

import java.util.Scanner;

public class Re_3 {
    /*
     *   팩토리얼
     * */
    private int re(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * re(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Re_3 r = new Re_3();
        System.out.println(r.re(sc.nextInt()));
    }
}
