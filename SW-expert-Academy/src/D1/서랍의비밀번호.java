package D1;
import java.util.Scanner;

// 설명 : 서랍의 비밀번호가 생각이 나지 않는다.
//       비밀번호 P는 000부터 999까지 번호 중의 하나이다.
//       주어지는 번호 K부터 1씩 증가하며 비밀번호를 확인해 볼 생각이다.
//       예를 들어 비밀번호 P가 123 이고 주어지는 번호 K가 100 일 때, 100부터 123까지 24번 확인하여 비밀번호를 맞출 수 있다.
//       P와 K가 주어지면 K부터 시작하여 몇 번 만에 P를 맞출 수 있는지 알아보자.
// 입력 예시 : 123 100
// 출력 에시 : 24
public class 서랍의비밀번호 {
    public static void main(String[] args) {
        서랍의비밀번호  m = new 서랍의비밀번호();
        Scanner sc =  new Scanner(System.in);
        int p = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(p - k + 1);
    }
}
