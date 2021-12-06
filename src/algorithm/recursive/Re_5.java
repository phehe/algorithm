package algorithm.recursive;

import java.util.Scanner;

public class Re_5 {
    public int re(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return re(n - 2) + re(n - 1);
        }
    }

    static int[] fibo;

    public int re2(int n) {
        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = re2(n - 2) + re2(n - 1);
        }
    }

    public int re3(int n) {
        if (fibo[n] > 0) {
            return fibo[n];
        }
        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = re3(n - 2) + re3(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Re_5 re = new Re_5();

        int n = sc.nextInt();
        fibo = new int[n + 1];
        re.re3(n);

        for (int i = 1; i <= n; i++) {
            System.out.println(fibo[i] + " ");
        }
    }
}
