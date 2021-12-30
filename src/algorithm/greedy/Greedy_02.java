package algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Ex1 implements Comparable<Ex2> {
    public int s, e;

    Ex1(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Ex2 o) {
        if (this.e == o.e) {
            return this.s - o.s;
        } else {
            return this.e - o.e;
        }
    }
}

public class Greedy_02 {

    public int solution(ArrayList<Ex2> arr, int n) {
        int cnt = 0;

        Collections.sort(arr);

        int et = 0;

        for (Ex2 ob : arr) {
            if (ob.s >= et) {
                cnt++;
                et = ob.e;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Ex1> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Ex1(x, y));
        }

        Greedy_02 gr2 = new Greedy_02();
        System.out.println(gr2.solution(arr, n));
    }
}