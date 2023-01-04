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
        홀수더하기  m = new 홀수더하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // test 갯수
        int[] sumarr = new int[n];  // sum 값을 저장하는 배열
        int[][] arr = new int[n][10];
        for(int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[j][i] = sc.nextInt();
            }
            sumarr[j] = sum;
        }

        for(int i = 0; i < n; i++) {
            System.out.println("#" + i + " " + sumarr[i]);
        }
    }
}
