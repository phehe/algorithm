package algorithm.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMap_1 {
    /**
     * @Author : ha
     * @ClassName : HashMap_1
     * @Date : 2021-10-20
     * @ 학급회장 -> 후보 ABCDE -> 학생 수 N  -> 투표 -> 회장 누가 당선
     * <p>
     * 15
     * BACBACCACCBDEDE   -> C
     **/

    public char solution(int n, String str) {
        char result = ' ';

        HashMap<Character, Integer> map = new HashMap();

        int max = 0;
        for (char key : str.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);   // -> key 값이 없으면 세팅하고 기본값을 0으로 설정 -> cnt++;
//            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
//            System.out.println(entries);
            if (map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }

        Set<Character> characters = map.keySet();

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = sc.next();

        HashMap_1 hs = new HashMap_1();

        System.out.println(hs.solution(n, str));

    }


}
