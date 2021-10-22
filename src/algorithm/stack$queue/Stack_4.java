package algorithm.stack$queue;

import java.util.Scanner;
import java.util.Stack;

public class Stack_4 {
    /**
     * @Author : ha
     * @ClassName : Stack_4
     * @Date : 2021-10-22
     * @ 후위연산
     * 352+*9-   -> 12
     **/

    public int solution(String str) {
        Stack<Integer> stk = new Stack<>();

        int result = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stk.push(c - 48);
            } else {
                int rt = stk.pop();
                int lt = stk.pop();
                if (c == '+') stk.push(lt + rt);
                else if(c=='-') stk.push(lt - rt);
                else if(c=='*') stk.push(lt * rt);
                else if(c=='/') stk.push(lt / rt);
            }
        }
        result = stk.get(0);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Stack_4 st = new Stack_4();
        System.out.println(st.solution(str));
    }

}
