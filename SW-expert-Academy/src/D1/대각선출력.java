package D1;
import java.util.Scanner;

// 설명 : 주어진 텍스트를 그대로 출력
// 입력 예시 : #++++
//           +#+++
//           ++#++
//           +++#+
//           ++++#
// 출력 에시 : #++++
//           +#+++
//           ++#++
//           +++#+
//           ++++#

public class 대각선출력 {
    public static void main(String[] args) {
        대각선출력  m = new 대각선출력();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n;  j++) {
                if(i == j) {
                    System.out.print("#");
                }
                else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
