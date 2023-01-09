package D1;
import java.util.Scanner;

// 설명 : 10개의 수를 입력 받아, 그 중에서 가장 큰 수를 출력하는 프로그램을 작성하라.
// 입력 예시 : 3
//           3 17 1 39 8 41 2 32 99 2
//           22 8 5 123 7 2 63 7 3 46
//           6 63 2 3 58 76 21 33 8 1
// 출력 예시 : #1 99
//           #2 123
//           #3 76

public class 최대수구하기 {
    public static void main(String[] args) {
        최대수구하기  m = new 최대수구하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 테스트 갯수
        int[][] arr = new int[n][10];  // 10개의 수를 입력받고 저장할 2차원 배열
        int[] max = new int[n];  // 출력값 저장을 위한 배열
        for(int i = 0; i < n; i++) {
            int answer = Integer.MIN_VALUE;  // 최대값 구하기이므로 answer을 최솟값으로 초기화
            for(int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();  // 값 입력
                answer = Math.max(answer, arr[i][j]);  // answer와 arr[i][j]의 수 중에서 더 큰 숫자로 answer에 입력
            }
            max[i] = answer;  // answer을 max 배열에 저장
        }
        for(int i = 0; i < n; i++) {
            System.out.println("#" + (i+1) + " " + max[i]);
        }
    }
}
