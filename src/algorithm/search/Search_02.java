package algorithm.search;

import java.util.Scanner;

public class Search_02 {
    /**
     * @Author : ha
     * @ClassName : Search_02
     * @Date : 2021-10-12
     * @ 이진검색 -> 기본적으로 정렬 된 상태에서 가능? -> pl pc pr   (0, n-1/2, n-1)
     * 첫번째, 중간, 마지막
     **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("arr[0] : ");
        arr[0] = sc.nextInt();

        for (int i = 1; i < arr.length; i++) {
            do {
                System.out.print("arr[" + i + "] : ");
                arr[i] = sc.nextInt();
            } while (arr[i] < arr[i - 1]);
        }

        System.out.print("찾는 값 : ");
        int key = sc.nextInt();


        int idx = search(arr, n, key);

        if (idx == -1) {
            System.out.println("값의 요소 없습니다.");
        } else {
            System.out.println(key + "값은 arr[" + idx + "]에 있습니다.");
        }


    }

    static int search(int[] arr, int n, int key) {
        int first = 0; //검색 맨 앞요소
        int last = n - 1; // 검색 맨 뒤 요소

        do {
            int center = (first + last) / 2;   //  검색 중앙 n-1/2
            if (arr[center] == key) {
                for (; center > first; center--) {  // 키와 같은 맨 앞의 요소 찾기
                    if (arr[center - 1] < key) {
                        break;
                    }
                }
                return center;  // 검색 성공
            } else if (arr[center] < key) {
                first = center + 1;  // 검색 범위를 앞쪽 절반으로 좁힌다
            } else {
                last = center - 1; // 검색 범위 뒤쪽 절반
            }
        } while (first <= last);
        return -1;      //실패
    }
}
