package D1;
import java.util.Scanner;

// 설명 : n의 약수 출력
public class n의약수 {
    public static void main(String[] args) {
        n의약수  m = new n의약수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ;i <= n; i++) {
            if((n % i) == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
