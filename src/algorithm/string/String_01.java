package algorithm.string;


import java.util.Locale;
import java.util.Scanner;

public class String_01 {
    /**
     * @Author : ha
     * @ClassName : String_01
     * @Date : 2021-10-15
     * @문자열 입력 받아서 -> 특정문자가 입력 받은 문자열에 몇개 존재하는가 ?
     **/

    static int solution(String strUp, String chUp) {
        int cnt = 0;
        for (int i = 0; i < strUp.length(); i++) {
            if (strUp.charAt(i) == chUp.charAt(0)) {
                cnt++;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String ch = sc.next();

        String strUp = str.toUpperCase();
        String chUp = ch.toUpperCase();

//        char c = sc.next().charAt(0);
        System.out.println(solution(strUp, chUp));
    }
}
