package algorithm.arr;

import java.util.Scanner;

public class Array_03 {
    /**
     * @Author : ha
     * @ClassName : Array_03
     * @Date : 2021-10-08
     * @배열요소 값 역순 정렬
     **/

    private static int[] reverse(int[] arr) {

        // arr 배열에 다 드가있음 역순 해야함
        int tmp;
        for (int j = 0; j < arr.length / 2; j++) { // 0~4
            for (int list : arr) {
                System.out.print(list + " ");
            }
            System.out.println();
            tmp = arr[j];
            arr[j] = arr[arr.length - j - 1];
            arr[arr.length - j - 1] = tmp;
            System.out.println("a[" + j + "]과(와)" + "a[" + (arr.length - j - 1) + "]을 교환합니다.");
        }
        for (int list : arr) {
            System.out.print(list + " ");
        }
        System.out.println("역순정렬 끝");
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 요솟수 : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

}
