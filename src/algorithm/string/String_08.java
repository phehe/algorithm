package algorithm.string;

import java.util.Scanner;

public class String_08 {
    /**
     *  @Author : ha
     *  @ClassName : String_08
     *  @Date : 2021-10-16
     *  @팰린드롬 -> 문자열 앞뒤로 똑같은가 ? - > 알파벳이외의 문자 무시   --> replaceAll(정규식 사용)  Builder 잘사용
    **/

    public String solution(String str){
        String result="NO";

        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp)) {
            result ="YES";
        }

        return result;


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String_08 s = new String_08();
        System.out.println(s.solution(str));
    }
}
