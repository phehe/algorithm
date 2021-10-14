package algorithm.string;

import java.util.Scanner;

class String_02 {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (x >= 97 && x <= 122) answer += (char) (x - 32);
            else answer += (char) (x + 32);
        }
        return answer;
    }

    public static void main(String[] args) {
        String_02 st = new String_02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(st.solution(str));
    }
}