package algorithm.baekjoon;

import java.util.Scanner;

public class Ex_11720 {
    /**
     * @Author : ha
     * @ClassName : Ex_11720
     * @Date : 2021-10-15
     * @ 정수 문자열 정수 개수  -> N개 합
     **/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int sum=0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            sum += chars[i]-'0';
        }
        System.out.println(sum);



//
//        for (char aChar : chars) {
//            sum+=aChar-'0';
//        }
//        System.out.println(sum);
//
    }
}
