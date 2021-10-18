package algorithm.array;

import java.util.Scanner;

public class Array_10 {
    /**
     * @Author : ha
     * @ClassName : Array_10
     * @Date : 2021-10-18
     * @봉우리 N*N 격자 -> 높이 상하좌우 비교해서 높으면 봉우리다
     * 가장자리는 0으로  --> [][]/ 행열 비교 할 dx,dy [],
     **/
    public int solution(int n, int[][] arr) {
        int result = 0;

        int[] dx = {-1, 0, 1, 0}; // 행 위치 12,3,6,9
        int[] dy = {0, 1, 0, -1}; // 열 위치 12,3,6,9

        for (int i = 0; i < n; i++) { // 행
            for (int j = 0; j < n; j++) {  // 열
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int dxLine = i + dx[k];
                    int dyLine = j + dy[k];
                    /*         가장 자리 0 가르고 (기준값<=비교값) 거르는거 생각 */
                    if (dxLine >= 0 && dxLine < n && dyLine >= 0 && dyLine < n && arr[i][j] <= arr[dxLine][dyLine]) {   // 외부 0 인덱스 거르는거
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    result++;
                }
                /*
                0 0 0 0 0 0 0
                0 5 3 7 2 3 0
                0 3 7 1 6 1 0
                0 7 2 5 3 4 0
                0 4 3 6 4 1 0
                0 8 7 3 5 2 0
                0 0 0 0 0 0 0
                * */
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Array_10 a = new Array_10();

        System.out.println(a.solution(n, arr));


    }

}
/*
*
5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2
*
*
* */