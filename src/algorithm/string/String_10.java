package algorithm.string;

import java.util.Scanner;

public class String_10 {
    /**
     * @Author : ha
     * @ClassName : String_10
     * @Date : 2021-10-17
     * @ 가장 짧은 문자열 찾기  i=>teachermode  o=>e
     **/

    public int[] solution(String str, char c) {

        char[] chars = str.toCharArray(); // 문자 배열
        int[] result = new int[str.length()]; // 숫자 배열

        int p = 1000; //임시값

        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == c) {
                p = 0;
                result[i] = p;
            } else {
                p++;
                result[i] = p;
            }
        }

        int len = str.length() - 1;
        p = 1000;
        for (int i = len; i >= 0; i--) {
            if (chars[i] == c) {
                p = 0;
                result[i] = p;
            } else {
                p++;
                result[i] = Math.min(result[i], p);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        String_10 sd = new String_10();

        for (int i : sd.solution(str, c)) {
            System.out.print(i+" ");
        }
    }
}
