package D1;
import java.util.Arrays;
import java.util.Scanner;

// 설명 : 주어진 숫자만큼 # 을 출력해보세요.
//       주어질 숫자는 100,000 이하다.
// 입력 에시 : 3
// 출력 예시 : ###

public class 스탬프찍기 {
    public static void main(String[] args) {
        스탬프찍기 m = new 스탬프찍기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] ch = new char[n];
        Arrays.fill(ch, '#');
        for(char c : ch) {
            System.out.print(c);
        }
    }
}
