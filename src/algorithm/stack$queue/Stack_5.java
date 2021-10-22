package algorithm.stack$queue;

import java.util.Scanner;
import java.util.Stack;

public class Stack_5 {
    /**
     * @Author : ha
     * @ClassName : Stack_5
     * @Date : 2021-10-22
     * @ 레이저 절단
     * ()(((()())(())()))(()) -> 17  () 레이저 (    ) 막대기
     **/

    public int solution(String str) {
        int result = 0;

        Stack<Character> stk = new Stack();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {         // ( push
                stk.push('(');
            } else {
                stk.pop();              // )  pop
                if (str.charAt(i - 1) == '(') {    // 이전꺼 (  --> ()쌍  레이저
                    result += stk.size();
                } else {
                    result++;           // 아니면 막대기
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Stack_5 st = new Stack_5();
        System.out.println(st.solution(str));
    }
}
