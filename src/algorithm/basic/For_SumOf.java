package algorithm.basic;

import java.util.Scanner;

/*a,b 포함 그 사이의 정수 합*/
public class For_SumOf {
    static int sumOf(int a, int b) {

        int min;
        int max;
        int sum = 0;

        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        // a= 1 = b 10;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("정수 a,b 사이의 합 = "+ sumOf(a,b));
    }

}
