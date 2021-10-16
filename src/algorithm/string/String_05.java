package algorithm.string;

import java.util.Scanner;

public class String_05 {
    /**
     * @Author : ha
     * @ClassName : String_05
     * @Date : 2021-10-16
     * @영어 알파벳과 특수문자 구성된 문자열 뒤집기
     **/

    public String solution(String str) {
        String result = "";
        char[] chars = str.toCharArray();

        int lf = 0, rf = str.length() - 1;

        while (lf < rf) {
            if (!Character.isAlphabetic(chars[lf])) {
                lf++;
            } else if (!Character.isAlphabetic(chars[rf])) {
                rf--;
            } else {
                char tmp = chars[lf];
                chars[lf] = chars[rf];
                chars[rf] = tmp;
                lf++;
                rf--;
            }
        }
        result = String.valueOf(chars);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String_05 s = new String_05();
        System.out.println(s.solution(str));
    }
}
