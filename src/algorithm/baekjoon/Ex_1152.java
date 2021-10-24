package algorithm.baekjoon;

import java.util.Scanner;

public class Ex_1152 {
    /**
     * @Author : ha
     * @ClassName : Ex_1152
     * @Date : 2021-10-19
     * @ 단어의 개수  - > ex) The first character is a black ->  6개  "구분"
     **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] c = s.toCharArray();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c[i] == ' ') {
                cnt++;
            }
            if (i==s.length()-1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
