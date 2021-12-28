package algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Ex2 implements Comparable<Ex2> {
    public int time;
    public char state;

    Ex2(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Ex2 ob) {
        if (this.time == ob.time) return this.state - ob.state;
        else return this.time - ob.time;
    }
}

public class Greedy_03 {
    public int solution(ArrayList<Ex2> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);

        int cnt = 0;

        for (Ex2 ob : arr) {
            if (ob.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Ex2> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sT = sc.nextInt();
            int eT = sc.nextInt();
            arr.add(new Ex2(sT, 's'));
            arr.add(new Ex2(eT, 'e'));
        }

        Greedy_03 gr3 = new Greedy_03();
        System.out.println(gr3.solution(arr));
    }
}