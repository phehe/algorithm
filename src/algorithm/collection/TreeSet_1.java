package algorithm.collection;

import java.util.*;

public class TreeSet_1 {
    /**
     * @Author : ha
     * @ClassName : TreeSet_1
     * @Date : 2021-10-21
     * @현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
     * 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
     * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
     * 10 3
     * 13 15 34 23 45 65 33 11 26 42   -> 143
     * <p>
     * 0  1  2  3  4  5  6  7  8  9
     **/

    public int solution(int n, int t, int[] arr) {
        int result = -1;

        TreeSet<Integer> tSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {   //i =0
            for (int j = i + 1; j < n; j++) {   // j=1
                for (int k = j + 1; k < n; k++) {    // k=2     n = 10
                    tSet.add(arr[i] + arr[j] + arr[k]);
//                    System.out.println(("arr[i] =" + arr[i] + " arr[j] =" + arr[j] + " arr[k]=" + arr[k]));
                }
            }
        }
        int cnt = 0;
        for (int x : tSet) {
            cnt++;
            System.out.println(cnt + "=" + x);
//            if (cnt == t) {
//                return x;
//            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeSet_1 ts = new TreeSet_1();

        System.out.println(ts.solution(n, t, arr));
    }
}
