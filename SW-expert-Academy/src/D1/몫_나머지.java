package D1;
import java.util.Scanner;

// 설명 : 2개의 수 a, b를 입력 받아, a를 b로 나눈 몫과 나머지를 출력하는 프로그램을 작성하라.
// 입력 에시 : 3
//           9 2
//           15 6
//           369 15
// 출력 에시 : #1 4 1
//           #2 2 3
//           #3 24 9
public class 몫_나머지 {
    public static void main(String[] args) {
        몫_나머지 m = new 몫_나머지();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 테스트 갯수
//        int[][] arr = new int[n][2];  // 2차원 배열을 이용하여 풀이
//        int[][] div = new int[n][2];
//        for(int i = 0 ; i < n; i++) {
//            for(int j = 0 ;j < 2; j++) {
//                arr[i][j] = sc.nextInt();  2중 for문으로 입력 숫자 배열에 저장
//            }
//        }
//        for(int i = 0 ; i < n; i++) {
//            for(int j = 0; j < 1; j++) {
//                div[i][j] = (arr[i][j] / arr[i][j+1]);  // arr 배열 안에 있는 데이터를 문제의 조건에 맞게 계산하여 저장
//                div[i][j+1] = (arr[i][j] % arr[i][j+1]);
//            }
//        }
//        for(int i = 0 ; i < n; i++) {
//            for(int j = 0; j < 1; j++) {
//                System.out.print("#" + (i+1) + " " + div[i][j] + " " + div[i][j+1]);  // 출력 조건에 맞게 print문으로 출력
//            }
//            System.out.println();
////        }
        for(int i = 0; i < n; i++) {  // for문으로 바로바로 출력
            int a = sc.nextInt();
            int b =sc.nextInt();
            System.out.print("#" + (i+1) + " " + a/b + " " + a%b);
            System.out.println();
        }
    }
}
