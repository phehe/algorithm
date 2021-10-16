package algorithm.string;

import java.util.Scanner;

public class String_03$ {

    /* indexOf(), subString()*/
    public String solution(String str) {
        String result = "";
        int m = 0;
        int pos = 0;

        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int length = tmp.length();
            if (length > m) {
                m=length;
                result=tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) {
            result =str;
        }


        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String_03$ s = new String_03$();
        System.out.println(s.solution(str));

    }
}
