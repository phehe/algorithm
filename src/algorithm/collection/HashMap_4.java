package algorithm.collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_4 {
    /**
     * @Author : ha
     * @ClassName : HashMap_4
     * @Date : 2021-10-20
     * @ S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
     * <p>
     * bacaAacba
     * abc         -> 3
     **/
    public int solution(String a, String b) {
        int result = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char x : b.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        int k = b.length() - 1;

        for (int i = 0; i < k; i++) {
            map1.put(a.charAt(i), map1.getOrDefault(a.charAt(i), 0) + 1);
        }

        int lt = 0;

        for (int rt = k; rt < a.length(); rt++) {
            map1.put(a.charAt(rt), map1.getOrDefault(a.charAt(rt), 0) + 1);
            if (map1.equals(map2)) {
                result++;
            }
            map1.put(a.charAt(lt), map1.get(a.charAt(lt)) - 1);
            if (map1.get(a.charAt(lt)) == 0) {
                map1.remove(a.charAt(lt));
            }
            lt++;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();


        HashMap_4 hs = new HashMap_4();

        System.out.print(hs.solution(a, b));
    }
}