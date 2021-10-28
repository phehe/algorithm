package algorithm.recursive;

public class Re_1 {
    /*
     *   스택프레임 생각  -> 파라미터, 지역변수, 리턴주소(라인)
     *   메서드 놀이터
     *   스택 상단에서부터 pop
     *   if()else
     * */
    public void re(int n) {
        if (n == 0) {
            return;                             // 종료
        } else {
            //System.out.print(n+" ");           3 2 1
            re(n - 1);
            System.out.println(n + " ");          // 1 2 3
        }
    }

    public static void main(String[] args) {
        Re_1 r = new Re_1();
        r.re(3);
    }
}
