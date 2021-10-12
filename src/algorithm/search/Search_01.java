package algorithm.search;

import java.util.Scanner;

public class Search_01 {
    /**
     *  @Author : ha
     *  @ClassName : Search_01
     *  @Date : 2021-10-10
     *  @ 검색 -> 선형검색  요솟수 -> 검색값
    **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("검색 값 : ");
        int key = sc.nextInt();

        int idx = search(arr, n, key);

        if (idx == -1) {
            System.out.println("키 값의 요소가 없습니다.");
        } else {
            System.out.println(key+"값은 arr["+idx+"]에 있습니다.");
        }
    }

    private static int search(int[] arr, int n, int key) {
        int i=0;

        while (true) {
            if (i == n) {
                return -1;
            }
            if (arr[i] == key) {
                return i;
            }
            i++;
        }
    }
}
