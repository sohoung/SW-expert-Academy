package D1;
import java.util.Scanner;

// 설명 : 연월일 순으로 구성된 8자리의 날짜가 주어진다. 해당 날짜의 유효성을 판단한 후 날짜가 유효하다면 "YYYY/MM/DD" 형식으로 출력하고
//       날짜가 유효하지 않을 경우에는 -1을 출력하시오. 연월일로 구성된 입력에서 월은 1~12 사이 값을 가져야 하며 일은 [표1] 과 같이, 1일 ~ 각각의 달에 해당하는 날짜까지의 값을 가질 수 있다.
// 입력 예시 : 5
//           22220228
//           20150002
//           01010101
//           20140230
//           11111111
// 출력 에시 : #1 2222/02/28
//           #2 -1
//           #3 0101/01/01
//           #4 -1
//           #5 1111/11/11
public class 연월일달력 {
    static int[] daycount = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        연월일달력  m = new 연월일달력();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            Stirng str = sc.next();
            int year = Integer.parseInt(str.substring(0,4));
            int month = Integer.parseInt(str.substring(4,6));
            int day = Integer.parseInt(str.substring(6,8));
        }
        for(int i = 0 ; i < n; i++) {
            System.out.println("#" + (i+1) + " " + year + "/" + month + "/" + day);
        }
    }
}
