package D1;

// 설명 : 10개의 수를 입력받아 그 중에서 홀수만 더하는 값을 출력하는 프로그램을 작성하세요.
// 입력 예시 : 3
//           3 17 1 39 8 41 2 32 99 2
//           22 8 5 123 7 2 63 7 3 46
//           6 63 2 3 58 76 21 33 8 1
// 출력 예시 : #1 200
//           #2 208
//           #3 121

import java.util.Scanner;

public class 홀수더하기 {
    public static void main(String[] args) {
        홀수더하기 m = new 홀수더하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // test 갯수
        int[][] arr = new int[n][10];  // 입력받은 10개의 수 3번을 저장하는 2차원 배열
        int[] sumarr = new int[n];  // 합을 저장하는 합 배열
        for(int i = 0; i < n; i++) {
            int sum = 0;  // 다음 sum을 위해서 sum을 0으로 초기화
            for(int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();  // 2중 for문으로 2차원 배열 값 저장
                if(arr[i][j] % 2 == 1) {  // if 조건문으로 arr 배열에 있는 데이터 값이 2로 나누었을 때 나머지가 1인 경우 즉 홀수인 경우에
                    sum += arr[i][j];     // sum에 arr의 배열 값을 누적합해주고
                    sumarr[i] = sum;      // 출력을 위해서 sumarr 배열에 sum 값을 넣어준다.
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println("#" + (i+1) + " " + sumarr[i]);
        }
    }
}
