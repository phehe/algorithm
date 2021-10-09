package algorithm.array;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {
    /**
     *  @Author : ha
     *  @ClassName : Array_02
     *  @Date : 2021-10-08
     *  @랜덤 키 출력
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
        Random ran = new Random();

        System.out.println("키의 최대값 구하기");
        int n = ran.nextInt(100)+1;
        System.out.println("사람 수 : " + n);

        int[] height = new int[n];

        System.out.println("-----------키값 ---------------");
        for (int i = 0; i < n; i++) {
            height[i] = 100+ran.nextInt(100)+1;
            System.out.println("height[" + i + "] = " + height[i]);
        }

        System.out.println("키 최대값 : " + MaxOf(height));
    }
}
