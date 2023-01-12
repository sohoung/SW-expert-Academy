package D1;
import java.util.Scanner;

// 설명 : 주어진 숫자에 대한 횟수만큼 2를 곱한 값을 출력
public class 더블더블 {
    public static void main(String[] args) {
        더블더블  m = new 더블더블();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for(int i = 0; i <= n; i++) {
            System.out.print(sum + " ");
            sum *= 2;
        }
    }
}
