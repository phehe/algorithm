package algorithm.array;

import java.util.Scanner;

public class Array_01 {
    /**
     *  @Author : ha
     *  @ClassName : Array_01
     *  @Date : 2021-10-08
     *  @사람 수, 키 출력
    **/

    static int MaxOf(int[] height) {
        int max = height[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최대값 구하기");
        System.out.print("사람 수 : ");
        int n = sc.nextInt();

        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("height[" + i + "] = ");
            height[i] = sc.nextInt();
        }

        System.out.println("키 최대값 : " + MaxOf(height));
    }
}
