package D1;
import java.util.Scanner;

// 설명 : 1부터 주어진 숫자만큼 더한 값을 출력. 단 숫자는 10000을 넘지 않는다.
// 입력 에시 : 10
// 출력 예시 : 55
public class n줄덧셈 {
    public static void main(String[] args) {
        n줄덧셈  m = new n줄덧셈();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
