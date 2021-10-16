package algorithm.string;


import java.util.Scanner;

public class String_07 {
    /**
     * @Author : ha
     * @ClassName : String_07
     * @Date : 2021-10-16
     * @회문 문자열 -> 앞뒤로 읽어도 똑같은 문자 -> YES 아니면 NO 출력
     **/

    public String solution(String str) {
        String result = "YES";

        str = str.toUpperCase();
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                result = "NO";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String_07 s = new String_07();
        System.out.println(s.solution(str));
    }

}
