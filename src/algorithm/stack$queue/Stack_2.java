package algorithm.stack$queue;

import java.util.Scanner;
import java.util.Stack;

public class Stack_2 {
    /**
     * @Author : ha
     * @ClassName : Stack_2
     * @Date : 2021-10-21
     * @ 괄호 문자 제거 -> 입력된 () 안에 포함 된 문자는 제거 남은 문자만 출력
     * <p>
     * (A(BC)D)EF(G(H)(IJ)K)LM(N)   ->EFLM
     **/

    public String solution(String str) {
        String result = "";

        Stack<Character> st = new Stack();

        for (char c : str.toCharArray()) {
            if (c == ')') {
                while (st.pop() != '(');   // ( 꺼내고 리턴 받은값(꺼낸값)이랑  비교 -> (==(
            } else st.push(c);
        }
        for (Character character : st) {
            result += character;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Stack_2 stk = new Stack_2();
//        stk.solution(str);
        System.out.println(stk.solution(str));


    }
}
