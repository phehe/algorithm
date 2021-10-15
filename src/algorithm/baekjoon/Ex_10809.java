package algorithm.baekjoon;

import java.util.Locale;
import java.util.Scanner;

public class Ex_10809 {
    /**
     * @Author : ha
     * @ClassName : Ex_10809
     * @Date : 2021-10-15
     * @단어를 입력 받아 각각의 알파벳에 대하여 단어에 포함 된 경우  위치 요소값 없으면 -1
     **/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String s = str.toLowerCase();

        //65,90 + 32 97,122
        for (int i = 97; i <= 122; i++) {
            System.out.print(s.indexOf(i)+" ");

        }

    }
}
