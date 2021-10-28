package algorithm.recursive;

import java.util.Scanner;

public class Re_2 {
    /*
     *   이진수출력
     * */
    private void re(int n) {
        int a = n % 2;
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        re(n / 2);
        System.out.print(a + " ");
    }

    private void re2(int n) {
        if (n == 0) {
            return;
        } else {
            re2(n / 2);
            System.out.print(n % 2 + " ");
        }
    }


    public static void main(String[] args) {
        Re_2 r = new Re_2();

        Scanner sc = new Scanner(System.in);
        r.re2(sc.nextInt());
    }

}
