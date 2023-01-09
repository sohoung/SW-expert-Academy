package D1;
import java.util.Scanner;

// 설명 : 2개의 수를 입력 받아 크기를 비교하여 등호 또는 부등호를 출력하는 프로그램을 작성하라.
// 입력 예시 : 3
//           3 8
//           7 7
//           369 123
// 출력 예시 : #1 <
//           #2 =
//           #3 >
public class 놈놈놈 {
    public static void main(String[] args) {
        놈놈놈 m = new 놈놈놈();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] ch = new char[n];  // 출력값을 위한 char형 배열
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();  // 비교할 두 개의 수를 입력
            int b = sc.nextInt();  // 비교할 두 개의 수를 입력
            if(a - b == 0) {  // if - else if 문으로 조건에 따른 다른 출력값 char 배열에 저장
                ch[i] = '=';  //  a에서 b를 뺀 값이 0이면 a와 b가 같으므로 '='
            }
            else if(a - b > 0){  // a에서 b를 뺀 값이 양수이면 a가 더 크다는 의미이므로 '>'
                ch[i] = '>';
            }
            else {
                ch[i] = '<';  // a에서 b를 뺀 값이 음수이면 b가 a보다 더 큰 값이므로 '<'
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println("#" + (i+1) + " " + ch[i]);
        }
    }
}
