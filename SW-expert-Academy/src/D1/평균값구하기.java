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
        int[][] arr = new int[n][10];  // 입력받을 10개의 수를 저장하는 2차원 배열
        int[] ave = new int[n];        // 출력을 위한 평균값을 저장하는 배열
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];  // 먼저 평균값을 위한 sum 즉 입력받은 수의 합을 먼저 구해준다.
            }
            if(sum % 10 <= 5) {
                // 그리고 만약 285 같이 일의 숫자가 5 이상인 숫자는 반 올림을 해야하므로 if 조건문으로 sum을 10으로 나눈 나머지에서 나머지가 5이상과 5이하일 때를 구해서
                // 이상이면 몫에서 1을 더 증가시켜주고 이하이면 몫 그대로 값을 return 해준다.
                ave[i] = sum / 10;  // 일의 자리 숫자가 5이하이므로 몫의 값 그대로 return
            }
            else {
                ave[i] = sum / 10 + 1;  // 일의 자리 숫자가 5이상이므로 몫의 값에서 1증가시켜서 return
            }
        }
        for(int i = 0 ; i < n; i++) {
            System.out.println("#" + (i+1) + " " + ave[i]);// for문으로 출력
        }
    }
}
