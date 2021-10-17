package algorithm.string;

import java.util.Scanner;

public class String_11 {
    /**
     * @Author : ha
     * @ClassName : String_11
     * @Date : 2021-10-17
     * @알파벳 대문자로 입력 받아 -> 문자 연속 반복적으로 입력 받았으면 숫자 같이 적어라 ex)-> in)KKHSSSSSSSE -> out)K2HS7E
     **/

    public String solution(String str) {
        String result = "";

        String s = str.toUpperCase();
        s = s + " ";
        char[] chars = s.toCharArray();

        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == chars[i + 1]) {
                cnt++;
            } else {
                result += chars[i];
                if (cnt > 1) {
                    result += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String_11 asd = new String_11();

        System.out.println(asd.solution(str));
    }
}
