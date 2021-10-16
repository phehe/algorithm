package algorithm.string;

import java.util.Scanner;

public class String_03 {
    /**
     * @Author : ha
     * @ClassName : String_03
     * @Date : 2021-10-15
     * @한개의 문장이 주어지면 문장속에서 가장 긴 단어를 출력
     **/

    public String solution(String[] s) {
        int length = 0;
        String result = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > length) {
                length = s[i].length();
                result = s[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] s = str.split(" ");

        String_03 sr = new String_03();
        System.out.println(sr.solution(s));
    }
}
