package algorithm.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String_04 {
    /**
     * @Author : ha
     * @ClassName : String_04
     * @Date : 2021-10-16
     * @N개의 단어가 주어지면 각 단어를 뒤집어라
     **/


    public void solutionZ(String[] str, int n) {
        String tmp = "";
        for (String s : str) {
            tmp = new StringBuilder(s).reverse().toString();
            System.out.println(tmp);
        }
    }

    public List<String> solution(String[] str, int n) {
        List<String> result = new ArrayList<>();
        for (String s : str) {
            String temp = new StringBuilder(s).reverse().toString();
            result.add(temp);
        }
        return result;
    }

    public List<String> soulution2(String[] str, int n) {
        List<String> result = new ArrayList<>();
        for (String s : str) {
            char[] chars = s.toCharArray();
            int start = 0, end = chars.length - 1;
            while (start < end) {
                char tmp = chars[start];
                chars[start] = chars[end];
                chars[end] = tmp;
                start++;
                end--;
            }
            String tmp = String.valueOf(chars);
            result.add(tmp);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];  // apple, banana, carrot

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        String_04 s = new String_04();

        for (String s1 : s.soulution2(str, n)) {
            System.out.println(s1);
        }

    }
}