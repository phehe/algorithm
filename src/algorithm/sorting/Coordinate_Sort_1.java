package algorithm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Coordinate_Sort_1 {
    /**
     * @Author : ha
     * @ClassName : Coordinate_Sort_1
     * @Date : 2021-10-27
     * @ n개의 좌표를 입력 받아 -> x,y로 구분 -> 모든 좌표를 오름차순으로 구분해라.
     * <p>
     * 5       ->
     * 2 7          1 2
     * 1 3          1 3
     * 1 2          2 5
     * 2 5          2 7
     * 3 6          3 6
     **/

    static class Point implements Comparable<Point> {
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) {
                return this.y - o.y;      // 음수값 리턴
            } else {
                return this.x - o.x;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Point> list = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Point(x, y));
        }
        Collections.sort(list);
        for (Point point : list) {
            System.out.println(point.x+" "+ point.y);
        }
    }
}
