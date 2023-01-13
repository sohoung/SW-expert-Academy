package D2;

import java.util.ArrayList;
import java.util.Scanner;

// 설명 : 25년 간의 수행 끝에 원재는 미래를 보는 능력을 갖게 되었다. 이 능력으로 원재는 사재기를 하려고 한다.
//       다만 당국의 감시가 심해 한 번에 많은 양을 사재기 할 수 없다.
//       다음과 같은 조건 하에서 사재기를 하여 최대한의 이득을 얻도록 도와주자.
//       1. 원재는 연속된 N일 동안의 물건의 매매가를 예측하여 알고 있다.
//       2. 당국의 감시망에 걸리지 않기 위해 하루에 최대 1만큼 구입할 수 있다.
//       3. 판매는 얼마든지 할 수 있다.
//       예를 들어 3일 동안의 매매가가 1, 2, 3 이라면 처음 두 날에 원료를 구매하여 마지막 날에 팔면 3의 이익을 얻을 수 있다.
// 입력 에시 : 3
//           3
//           10 7 6
//           3
//           3 5 9
//           5
//           1 1 3 1 2
// 출력 에시 : #1 0
//           #2 10
//           #3 5
public class 백만장자프로젝트 {
    public static void main(String[] args) {
        백만장자프로젝트 m = new 백만장자프로젝트();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 갯수 입력
        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();  // 거래 일 수
            ArrayList<Integer> lst = new ArrayList<Integer>();  // ArrayList로 Integer 타입의 객체 생성
            for (int i = 0; i < n; i++) {
                lst.add(sc.nextInt());  // 거래일 마다 거래 가격 입력
            }
            int max_price = 0;
            int answer = 0;            // 이익 가격
            for (int i = n - 1; i >= 0; i--) {
                int price = lst.get(i);  // 마지막 거래 가격을 get으로 접근
                if (price > max_price) {
                    max_price = price;
                }
                else {
                    answer += (max_price - price);
                }
            }
            System.out.println("#" + tc + " " + answer);
        }
    }
}
