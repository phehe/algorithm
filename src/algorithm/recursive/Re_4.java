package algorithm.recursive;

import java.util.Scanner;

public class Re_4 {
    /*
     *   피보나치 재귀호출
     *   메모이제이션 - > 동적계획법, 동일 계산 반복 -> 이전 계산 값 메모리에 저장 -> 반복 제거 -> 실행속도 up
     * */

    /*바보*/
    public int re(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return re(n - 2) + re(n - 1);
        }
    }

    /*메모이제이션*/
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

    /*메모이제이션을 활용*/
    public int re3(int n) {
        /*  fibo배열에 이미 있으면 우측가지 뻗을 필요 없다.
        *   배열 초기 값 00000 -> 조건 확인
        * */
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

        Re_4 re = new Re_4();

        int n = sc.nextInt();
        fibo = new int[n + 1];
        re.re3(n);

        for (int i = 1; i <= n; i++) {
            System.out.println(fibo[i] + " ");
        }
    }
}
