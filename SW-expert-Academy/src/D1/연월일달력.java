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
    static int[] daycount = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    // 1월부터 12월까지의 마지막 일수를 저장하는 배열이다. 인덱스 0번은 그냥 없는 것으로 생각하고 1번 인덱스를 1월로 생각한다.

    public static void main(String[] args) {
        연월일달력 m = new 연월일달력();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 입력 갯수
        for (int i = 1; i <= n; i++) {  // 인덱스를 1번부터 사용하므로 1부터 시작
            String str = sc.next();
            int year = Integer.parseInt(str.substring(0, 4));  // substring으로 0번 문자열부터 3번 문자열까지 추출
            int month = Integer.parseInt(str.substring(4, 6)); // substring으로 4번 문자열부터 5번 문자열까지 추출
            int day = Integer.parseInt(str.substring(6, 8));   // substring으로 6번 문자열부터 7번 문자열까지 추출

            if (month > 0 && month < 13 && day <= daycount[month]) {
                // month는 달로 1월부터 12월까지 입력이되고 day는 daycount에 저장되어있는 일수와 같거나 작다면 true
                if (year < 1000) {  // 년수가 1000년 이하라면 앞에 0을 붙여야 하므로 따로 if문 생성
                    if (month < 10 && day < 10) {
                        // month가 10이하이면 앞에 0, day가 10보다 작으면 앞에 0
                        System.out.println("#" + i + " 0" + year + "/0" + month + "/0" + day);
                    } else if (month < 10) {
                        // month만 10보다 작으면 앞에 0
                        System.out.println("#" + i + " 0" + year + "/0" + month + "/" + day);
                    }
                }
                else if (month < 10) {
                    // 1000년 이상일 경우에서 month가 10 이하인경우
                    System.out.println("#" + i + " " + year + "/0" + month + "/" + day);
                } else {
                    // 1000년 이상이고 month가 10이상이고 day가 10이상
                    System.out.println("#" + i + " " + year + "/" + month + "/" + day);
                }
            } else {
                // 말이 안되는 달력일 때
                System.out.println("#" + i + " " + -1);
            }
        }
    }
}