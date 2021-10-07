package algorithm.basic;

import java.util.Scanner;

public class For_Sum {
    /**
     * @Author : ha
     * @ClassName : For_Sum
     * @Date : 2021-10-07
     * @ n까지의 합 출력  ex) n=5 --> 1+2+3+4+5=sum
     **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;


        for (int i = 1; i <= n; i++) {
            sum += i;

            if (i < n) {
                System.out.print(i + "+");
            } else if (i == n) {
                System.out.println(n + "=" + sum);
            }

        }
//        System.out.println("1부터 " + N + "까지의 합: " + sum);

    }
}
