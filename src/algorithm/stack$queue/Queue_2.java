package algorithm.stack$queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_2 {
    /**
     * @Author : ha
     * @ClassName : Queue_2
     * @Date : 2021-10-22
     * @ 수업계획서
     * 필수과목 CBA   -> 수업계획서 수행하려면 반드시 C B A 이 순서에 맞게 계획서를 작성해야한다.
     * 수업계획서 CBDAGE -> YES
     **/

    public String solution(String str1, String str2) {
        String result = "YES";

        Queue<Character> q = new LinkedList();

        for (char c : str1.toCharArray()) {     // CBA
            q.offer(c);
        }

        for (char c : str2.toCharArray()) {    // CBDAGE
            if (q.contains(c)) {
                if (c != q.poll()) {   // 있는데 맨 앞에 없으면
                    return "NO";
                }
            }
        }
        if (!q.isEmpty()) {         // str1에 요소 남아 있어도 No
            return "NO";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        Queue_2 q = new Queue_2();
        System.out.println(q.solution(str1, str2));
    }

}
