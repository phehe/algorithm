package algorithm.array;

import java.util.Scanner;

public class Array_11 {
    /**
     * @Author : ha
     * @ClassName : Array_11
     * @Date : 2021-10-18
     * @ 학생 수 반장 뽑기  -  > 3중 / 중복 / break;
     *
      5   학생 수
       1 2 3 4 5  학년

   1   2 3 1 7 3
   2   4 1 9 6 8
   3   5 5 2 4 4
   4   6 5 2 6 7
   5   8 4 2 2 2 -> 4
  학생   **/


    public int solution(int n, int[][] arr) {
        int result = 0;
        int max =0;
        for (int i = 1; i <=n; i++) {  // ex) 학생 1
            int cnt = 0;
            for (int j = 1; j <=n; j++) {   // 나머지 학생
                for (int k = 1; k <=5; k++) {
                    if (arr[i][k] == arr[j][k]) { // i,j -> 학생 / k -> 학년
                        cnt++;
                        break;   // 중복 xx
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                result=i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n + 1][6];


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Array_11 a = new Array_11();

        System.out.println(a.solution(n,arr));
    }

}
