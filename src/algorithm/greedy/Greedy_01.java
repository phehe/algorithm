package algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
*   그리디 다시 -> 최적의 선택 탐색하는 방법
* ㅁㄴㅇㅂ자업ㅈ
* */
class check implements Comparable<check> {
    public int h, w;

    check(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(check o) {
        return o.h - this.h;
    }
}

public class Greedy_01 {
    public int solution(ArrayList<check> arr, int n) {
        int cnt = 0;

        Collections.sort(arr);

        int max = Integer.MIN_VALUE;

        for (check body : arr) {
            if (body.w > max) {
                max = body.w;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<check> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new check(h, w));
        }

        Greedy_01 gr = new Greedy_01();
        System.out.println(gr.solution(arr, n));
    }
}