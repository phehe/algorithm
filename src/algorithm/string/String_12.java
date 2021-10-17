package algorithm.string;

import java.util.ArrayList;
import java.util.Scanner;

public class String_12 {
    /**
     * @Author : ha
     * @ClassName : String_12
     * @Date : 2021-10-17
     * @ 암호 - > 비밀편지 ( #, *)로만 이루어짐 7개가 하나의 문자 *#****#
     * 2진수 ->  #=1 *=0   / 2진수->10진수  -> 아스키코드
     **/


    public String solution(String str, int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String substring = str.substring(0, 7).replace("#", "1").replace("*", "0");
            int anInt = Integer.parseInt(substring, 2);
            answer += (char) anInt;
            str = str.substring(7);
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        String_12 s12 = new String_12();

        System.out.println(s12.solution(str,n));

    }

}
