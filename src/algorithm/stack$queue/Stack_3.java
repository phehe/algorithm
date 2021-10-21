package algorithm.stack$queue;

import java.util.Scanner;
import java.util.Stack;

public class Stack_3 {
    /**
     * @Author : ha
     * @ClassName : stack_3
     * @Date : 2021-10-21
     * @ 인형뽑기 -> 2차원 배열 N*N -> stack + 위치배열
     * 크레인 인형뽑기 카카오 변형
     * 5            -> n
     * 0 0 0 0 0    -> n*n
     * 0 0 1 0 3
     * 0 2 5 0 1
     * 4 2 4 4 2
     * 3 5 1 3 1
     * 8            -> moves[]
     * 1 5 3 5 1 2 1 4  -> 위치
     **/
    public int solution(int[][] board, int[] moves) {
        int result = 0;
        Stack<Integer> stk = new Stack<>();

        for (int pos : moves) {   // 위치
            for (int i = 0; i < board.length; i++) {   // board.length(행)   board[i].length(열)
                if (board[i][pos - 1] != 0) {   // 인형 존재
                    int tmp = board[i][pos - 1];   //뽑고
                    board[i][pos - 1] = 0; // 초기화
                    if (!stk.isEmpty() && tmp == stk.peek()) {  // 인형 터치기
                        result += 2;      //인형 개수
                        stk.pop();
                    } else {
                        stk.push(tmp);
                    }
                        break;   // 0 자꾸 빼면 x
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];

        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        Stack_3 stt = new Stack_3();

        System.out.println(stt.solution(board, moves));
    }
}
