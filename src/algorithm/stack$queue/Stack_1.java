package algorithm.stack$queue;

import java.util.Scanner;
import java.util.Stack;

public class Stack_1 {
    /**
     * @Author : ha
     * @ClassName : Stack_1
     * @Date : 2021-10-21
     * @ 올바른 괄호   (()))()()) - > 짝이 맞지 않으면 NO
     * (()(()))(() - > NO   (
     **/

    public String solution(String str) {
        String result = "YES";

        Stack st = new Stack();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                Object push = st.push(c);
            } else {
                if (st.isEmpty()) {
                    return "NO";
                }
                st.pop();
            }
        }
        if (!st.isEmpty()) {
            return "NO";
        }
        return result;
    }

    /* 런타임*/
    public String solution2(String str) {
        String result = "YES";

        Stack st = new Stack();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 40) {
                Object push = st.push(str.charAt(i));
            } else if (str.charAt(i) == 41) {
                st.pop();
            }
            if (i == str.length() - 1) {
                if (st.isEmpty()) {
                    return result;
                } else {
                    return "NO";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Stack_1 stk = new Stack_1();
        System.out.println(stk.solution(str));

//        char c = 40;
//        char d = 41;

    }
}
