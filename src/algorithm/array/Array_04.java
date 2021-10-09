package algorithm.array;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {
    /**
     * @Author : ha
     * @ClassName : Array_04
     * @Date : 2021-10-08
     * @배열 모든 요소 합계 반환 메서드
     **/

    static int sumOf(int[] arr) {
        //배열 숫자 들어가고 더하기

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i < arr.length) {
                if (i == arr.length - 1) {
                    System.out.println(arr[i] + "=" + sum);
                    break;
                }
                System.out.print(arr[i] + "+");
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(45) + 1;
        }


        sumOf(arr);
    }
}