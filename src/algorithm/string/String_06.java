package algorithm.string;

import java.util.Scanner;

public class String_06 {
    /**
     * @Author : ha
     * @ClassName : String_06
     * @Date : 2021-10-16
     * @중복문자 제거
     **/

    public String solution(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))==i) {  //ksekwdewkset
                result += str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String_06 s = new String_06();
        System.out.println(s.solution(str));
    }
}
