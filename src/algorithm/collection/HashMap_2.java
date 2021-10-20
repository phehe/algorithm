package algorithm.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMap_2 {

    /**
     * @Author : ha
     * @ClassName : HashMap_2
     * @Date : 2021-10-20
     * @ 아나그램 -> 동일한 개수의 문자열 2개를 비교해서 구성 요소가 같으면 yes 아니면 no
     * AbaAeCe
     * baeeACA   -> yes
     * abaCC
     * Caaab     -> no
     **/
    public String solution(String str1, String str2) {
        String result = "NO";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char d : str2.toCharArray()) {
            map2.put(d, map2.getOrDefault(d, 0) + 1);
        }

        Set<Map.Entry<Character, Integer>> entries = map1.entrySet();
        Set<Map.Entry<Character, Integer>> entries1 = map2.entrySet();

        if (entries.containsAll(entries1)) {
            result = "YES";
        }

        return result;
    }

    public String solution2(String str1, String str2) {
        String result = "YES";

        HashMap<Character, Integer> map = new HashMap();

        for (char key : str1.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (char key : str2.toCharArray()) {
            if (!map.containsKey(key) || map.get(key) == 0) {
                return "NO";
            }
            map.put(key, map.get(key) - 1);

        }


        return result;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        HashMap_2 hs = new HashMap_2();

        System.out.println(hs.solution2(str1, str2));
    }
}
