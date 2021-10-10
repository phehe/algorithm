package algorithm.baekjoon;

import java.util.Scanner;

public class Ex_3052 {
    /**
     * @Author : ha
     * @ClassName : Ex_3052
     * @Date : 2021-10-10
     * @ 10개의 수 입력 받아 42로 나눈 나머지 -> 나머지 다른 값이 몇개 있는지 출력
     **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[10]; // 정수 값 10개 저장

        int[] nam = new int[10]; // 나머지 값 10개 저장

        int cnt = 0;             // 다른 숫자 카운트
        int tmp;
        //정수 10개 입력
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // arr[]안에 있는 정수 나머지 배열에 넣는다
        for (int i = 0; i <arr.length; i++) {
            nam[i] = arr[i] % 42;
        }

        for (int i = 0; i < nam.length; i++) {
            tmp=0;
            for (int j = i+1; j <10; j++) {
                if (nam[i] == nam[j]) {
                    tmp++;
                }
            }
            if (tmp == 0) {
                cnt++;
            }
        }

        System.out.println(cnt);



    }
}
