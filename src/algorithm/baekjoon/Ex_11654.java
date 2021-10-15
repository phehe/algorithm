package algorithm.baekjoon;

import java.util.Scanner;

public class Ex_11654 {
    /**
     *  @Author : ha
     *  @ClassName : Ex_11654
     *  @Date : 2021-10-15
     *  @입력 받은 문자 ->아스키 코드값을 출력
    **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        byte[] bytes = str.getBytes();

        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
    }
}
