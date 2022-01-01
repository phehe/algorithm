package algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    public int money;
    public int time;

    Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(Lecture ob) {
        return ob.time - this.time;
    }
}

public class Greedy_04 {
    static int n, max = Integer.MIN_VALUE;

    public int solution(ArrayList<Lecture> arr) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);

        int j = 0;

        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (arr.get(j).time < i) break;
                pq.offer(arr.get(j).money);
            }
            if (!pq.isEmpty()) answer += pq.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        ArrayList<Lecture> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            arr.add(new Lecture(m, d));
            if (d > max) max = d;
        }
        Greedy_04 grr = new Greedy_04();
        System.out.println(grr.solution(arr));
    }
}