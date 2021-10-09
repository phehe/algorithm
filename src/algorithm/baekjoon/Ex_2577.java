package algorithm.baekjoon;

import java.util.Scanner;

public class Ex_2577 {
    /**
     * @Author : ha
     * @ClassName : Ex_2577
     * @Date : 2021-10-09
     * @ A/B/C 세 정수 A*B*C = 곱한 값 -> 0 몇번, 1 몇번, 2 몇번 .....
     *  쓰레기 코드 ㅇㅈ?
     **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int n = a * b * c;
        System.out.println(n);
        int[] arr = new int[10];
        int nam = 0;
        do {
            nam = n % 10; //나머지
            n = n / 10;    //몫
            if (n == 1) {
                arr[1]++;
            }
            if (nam == 0) {
                arr[0]++;
            }
            if (nam == 1) {
                arr[1]++;
            }
            if (nam == 2) {
                arr[2]++;
            }
            if (nam == 3) {
                arr[3]++;
            }
            if (nam == 4) {
                arr[5]++;
            }
            if (nam == 5) {
                arr[5]++;
            }
            if (nam == 6) {
                arr[6]++;
            }
            if (nam == 7) {
                arr[7]++;
            }
            if (nam == 8) {
                arr[8]++;
            }
            if (nam == 9) {
                arr[9]++;
            }
        } while (n / 10 !=0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//
//        do {
//
//        } while (n / 10 == 0);
    }
}
