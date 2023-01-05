package D1;
import java.util.Scanner;

// 설명 : 10개의 수를 입력받아 평균값을 출력하는 프로그램을 작성하세요.
// 입력 예시 : 3
//           3 17 1 39 8 41 2 32 99 2
//           22 8 5 123 7 2 63 7 3 46
//           6 63 2 3 58 76 21 33 8 1
// 출력 예시 : #1 24
//           #2 29
//           #3 27

public class 평균값구하기 {
    public static void main(String[] args) {
        평균값구하기  m = new 평균값구하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][10];
        int[] ave = new int[n];
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            ave[i] = sum / 10;
        }
        for(int i = 0 ; i < n; i++) {
            System.out.println("#" + (i+1) + " " + ave[i]);
        }
    }
}
