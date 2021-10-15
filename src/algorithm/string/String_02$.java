package algorithm.string;

import java.util.Scanner;

public class String_02$ {

    public String solution(String str) {
        String result = "";

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            }
                result += Character.toLowerCase(c);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String_02$ s = new String_02$();
        System.out.println(s.solution(str));

    }
}
