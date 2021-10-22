package algorithm.stack$queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_1 {
    /**
     * @Author : ha
     * @ClassName : Stack_6
     * @Date : 2021-10-22
     * @ 공주 구하기 -> N 왕자 수, k 자리 사람 빠지기 남은 한사람은 ?
     * 8, 3    ->  7
     **/

    public int solution(int n, int k) {

        int result = 0;

        Queue<Integer> q = new LinkedList();

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        while (!q.isEmpty()) {
            for (int i = 1; i < k; i++) {
                q.offer(q.poll());   // 앞 두개 뺀거 뒤로   ( 빼고 리턴 생각)
            }
            q.poll();            // k 번째꺼 삭제
            if (q.size() == 1) {
                result = q.poll();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue_1 qe = new Queue_1();
        System.out.println(qe.solution(n, k));
    }
}
