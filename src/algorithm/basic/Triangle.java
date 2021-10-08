package algorithm.basic;

import java.util.Scanner;

public class Triangle {

    /*왼쪽위*/
    static void triangleLU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*오른쪽위*/
    static void triangleRU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        triangleLU(n);
//        triangleRU(n);
//        triangleRB(n);
        spira(n);
    }
}
