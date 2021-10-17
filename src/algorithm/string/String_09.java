package algorithm.string;

import java.util.Scanner;

public class String_09 {
    /**
     * @Author : ha
     * @ClassName : String_09
     * @Date : 2021-10-16
     * @ 문자열에서 숫자만 출력
     **/


    public int solution(String str) {

        String s = str.toLowerCase().replaceAll("[a-z]", "");

        int anInt = Integer.parseInt(s);

        return anInt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String_09 ss = new String_09();
        System.out.println(ss.solution(str));
    }

}
