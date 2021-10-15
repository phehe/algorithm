package algorithm.string;

import java.util.Scanner;

class String_02 {
    /**
     * @Author : ha
     * @ClassName : String_02
     * @Date : 2021-10-15
     * @대소문자 변환 -> 대문자는 소문자 / 소문자는 대문자
     **/

    static void solution(String str) {
        byte[] bytes = str.getBytes();
        int temp = 0;
        for (int i = 0; i < bytes.length; i++) {
            temp = 0;
            if (bytes[i] >= 65 && bytes[i] <= 90) {
                temp += bytes[i] + 32;  // 65 + 32 97 -> A a
            } else if (bytes[i] >= 97 && bytes[i] <= 122) {
                temp += bytes[i] - 32;
            }
            String string = Character.toString(temp);
            System.out.print(string);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        solution(str);
    }
}