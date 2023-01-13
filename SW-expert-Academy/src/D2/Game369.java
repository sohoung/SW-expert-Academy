package D2;

import java.util.Scanner;

// 설명 : 3 6 9 게임을 프로그램으로 제작중이다. 게임 규칙은 다음과 같다.
//       1. 숫자 1부터 순서대로 차례대로 말하되, “3” “6” “9” 가 들어가 있는 수는 말하지 않는다.
//       1 2 3 4 5 6 7 8 9…
//       2. "3" "6" "9"가 들어가 있는 수를 말하지 않는대신, 박수를 친다. 이 때, 박수는 해당 숫자가 들어간 개수만큼 쳐야 한다.
//       예를 들어 숫자 35의 경우 박수 한 번, 숫자 36의 경우 박수를 두번 쳐야 한다.
//       입력으로 정수 N 이 주어졌을 때, 1~N 까지의 숫자를
//       게임 규칙에 맞게 출력하는 프로그램을 작성하라.
//       박수를 치는 부분은 숫자 대신, 박수 횟수에 맞게 “-“ 를 출력한다.
//       여기서 주의해야 할 것은 박수 한 번 칠 때는 - 이며, 박수를 두 번 칠 때는 - - 가 아닌 -- 이다.
// 입력 예시 : 10
// 출력 예시 : 1 2 - 4 5 - 7 8 - 10
public class Game369 {
    public static void main(String[] args) {
        Game369 m = new Game369();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int cnt = 0;  // 검증을 위한 cnt 변수
            if (i < 10) {  // 10 이하의 수
                if (i % 3 == 0) {  // 3으로 나눈 나머지가 0이면 3 6 9중에 하나
                    System.out.print("- ");
                } else {
                    System.out.print(i + " ");
                }
            } else {
                String str = Integer.toString(i);  // 2자리 숫자부터는 배열을 사용해서 각각 검사
                char[] ch = str.toCharArray();  // str을 기반으로 char형 배열 ch 생성
                for (int j = 0; j < ch.length; j++) {  // for문으로 배열 안에 있는 데이터를 각각 검증
                    if ((ch[j] - '0') != 0 && (ch[j] - '0' ) % 3 == 0) {  
                        cnt++;
                    }
                }
                if (cnt == 0) {  // cnt가 0이라는 말은 숫자에 3, 6, 9가 하나도 안들어가 있다는 말이다.
                    System.out.print(i + " ");
                } else {  // cnt가 > 0 이라면 숫자에 3,6,9,가 적어도 1개는 들어있다는 말이다.
                    for (int k = 0; k < cnt; k++) {
                        System.out.print("-");  // 3,6,9의 숫자만큼 "-"을 출력해준다.
                    }
                    System.out.print(" ");
                }
            }
        }
    }
}
