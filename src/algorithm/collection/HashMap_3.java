package algorithm.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMap_3 {
    /**
     * @Author : ha
     * @ClassName : HashMap_3
     * @Date : 2021-10-20
     * @ 매출액의 종류 - > N -> N일 간의 매출 기록  k = 연속된 일수
     * 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
     * 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
     * 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
     * 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
     * <p>
     * 7 4
     * 20 12 20 10 23 17 10   -> 3 4 4 3
     **/

    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            list.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap_3 hs = new HashMap_3();


        for (int x : hs.solution(n, k, arr)) {
            System.out.print(x+" ");
        }
    }
}
