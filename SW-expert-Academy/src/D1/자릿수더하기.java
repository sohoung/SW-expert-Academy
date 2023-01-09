package D1;
import java.util.Scanner;

// 설명 : 하나의 수를 입력받아 각 자릿수의 합을 계산하는 프로그램을 작성하세요
// 입력 예시 : 6789
// 출력 예시 : 30
public class 자릿수더하기 {
    public static void main(String[] args) {
        자릿수더하기  m = new 자릿수더하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        while(n > 0) {
            answer += (n % 10);  // 10으로 나눈 나머지는 무조건 일의 자리 숫자이다. 즉 일의 자리 숫자를 더해주고
            n = n / 10;          // n을 10으로 나눈 몫은 일의 자릿수를 뺀 나머지 자릿수로 갱신을 시킨다.
        }
        System.out.println(answer);
    }
}
