package algorithm.basic;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = sc.nextBoolean();
        System.out.println(b);

        String next = sc.next();
        System.out.println(next);

        String s = sc.nextLine();
        System.out.println(s);
    }
}
