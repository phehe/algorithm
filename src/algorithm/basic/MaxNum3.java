package algorithm.basic;

import java.util.Scanner;

public class MaxNum3 {
    /**
     * @Author : ha
     * @ClassName : MaxNum3
     * @Date : 2021-10-06
     * @정수 4개 -> 최대값
     **/

    //................super sad
    static int max4(int a, int b, int c, int d) {
        int max=0;
        if (a >= b) { //T a2 b2
            if (a >= c) { // a=b<c
                if (a >= d) {
                    max = a;
                }
            } else if (c >= d) {
                max = c;
            }else {
                max =d;
            }
        } else if (b >= c) { // F
            if (b >= d) {
                max = b;
            }
        } else if (c >= d) {
            max = c;
        } else {
            max = d;
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력 : ");
        int a = sc.nextInt();

        System.out.print("두번째 숫자 입력 : ");
        int b = sc.nextInt();

        System.out.print("세번째 숫자 입력 : ");
        int c = sc.nextInt();

        System.out.print("네번째 숫자 입력 : ");
        int d = sc.nextInt();

        System.out.println(max4(a, b, c, d));
    }


}
